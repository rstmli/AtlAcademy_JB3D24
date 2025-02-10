package az.otp.otp.service.impl;

import az.otp.otp.client.SmsClient;
import az.otp.otp.dao.entity.OtpEntity;
import az.otp.otp.dao.repository.OtpRepository;
import az.otp.otp.dto.SendOtpRequest;
import az.otp.otp.dto.SendOtpResponse;
import az.otp.otp.mapper.OtpMapper;
import az.otp.otp.service.OtpService;
import az.otp.otp.util.DateFormatter;
import az.otp.otp.util.enums.OtpStatus;
import az.otp.otp.util.halper.OtpGenerator;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OtpServiceImpl implements OtpService {
    private final OtpRepository repository;
    private final OtpGenerator otpGenerator;
    private final SmsClient smsClient;
    private final OtpMapper otpMapper;
    @Override
    public SendOtpResponse sendOtp(SendOtpRequest sendOtpRequest) {
        var otpEntity = repository.findByMsisdn(sendOtpRequest.msisdn());

        if(otpEntity.isPresent()){
            var otpData = otpEntity.get();
            if(otpData.getStatus().equals(OtpStatus.BLOCK)){
                if(otpData.getBlockTime().isAfter(LocalDateTime.now())){
                    // hele de gozlemelidir, geriye block expire time ve statusunu qaytar
                    return sendOtpResponse(otpData);
                }else{
                    // sifirla otp gonder send count 1 olsun
                    removeData(sendOtpRequest.msisdn());
                    var entity = sendOtpFIrstTime(sendOtpRequest.msisdn());
                    smsClient.smsSender(sendOtpRequest.msisdn(),entity.getOtpCode());
                    return sendOtpResponse(entity);
                }
            }else{
                if(otpData.getSmsCount()>= 5){
                    // set block status
                    otpData.setStatus(OtpStatus.BLOCK);
                    otpData.setBlockTime(LocalDateTime.now().plusMinutes(5));
                    var entity = repository.save(otpData);
                    return sendOtpResponse(entity);
                }else{
                    // send sms gonder , sms count artir, statusu pending set ele
                    otpData.setSmsCount(otpData.getSmsCount() + 1);
                    otpData.setStatus(OtpStatus.PENDING);
                    otpData.setOtpCode(otpGenerator.generete());
                    var entity = repository.save(otpData);
                    smsClient.smsSender(sendOtpRequest.msisdn(),entity.getOtpCode());
                    return sendOtpResponse(entity);
                }
            }
        }else{
            // first time otp request
            var entity = sendOtpFIrstTime(sendOtpRequest.msisdn());
            smsClient.smsSender(sendOtpRequest.msisdn(),entity.getOtpCode());
            return sendOtpResponse(entity);
        }
    }
    private OtpEntity sendOtpFIrstTime(String msisdn){
        var code = otpGenerator.generete();
        var entity = OtpEntity.builder().otpCode(code)
                .msisdn(msisdn)
                .status(OtpStatus.PENDING).smsCount(1)
                .expireTime(LocalDateTime.now()
                        .plusMinutes(5)).build();
        return repository.save(entity);
    }
    private SendOtpResponse sendOtpResponse(OtpEntity entity) {

        if(entity.getStatus() == OtpStatus.PENDING){
            return otpMapper.otpPanding(entity);
        } else if ((entity.getStatus() == OtpStatus.BLOCK)) {
            return otpMapper.otpBlocking(entity);
        }

        return new SendOtpResponse(
                entity.getStatus(),
                DateFormatter.dateFormatters(entity.getBlockTime()),
                DateFormatter.dateFormatters(entity.getExpireTime())
        );
    }

    private void removeData(String msisdn){
        var entity = repository.findByMsisdn(msisdn).get();
        repository.delete(entity);
    }

    @Scheduled(fixedRate = 300000) // 300000 ms = 5 dakika
    @Transactional
    public void removeExpiredOtp() {
        LocalDateTime now = LocalDateTime.now();

        // expireTime'ı geçmiş tüm OTP'leri silmek için repository kullanıyoruz
        repository.deleteByExpireTimeBefore(now);
    }
}
