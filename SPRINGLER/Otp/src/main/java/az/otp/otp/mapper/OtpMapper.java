package az.otp.otp.mapper;

import az.otp.otp.dao.entity.OtpEntity;
import az.otp.otp.dto.SendOtpResponse;
import az.otp.otp.util.DateFormatter;
import org.springframework.stereotype.Component;

@Component
public class OtpMapper {
    public SendOtpResponse otpPanding(OtpEntity e){
        return SendOtpResponse.builder().otpStatus(e.getStatus()).expireTime(DateFormatter.dateFormatters(e.getExpireTime())).build();
    }
    public SendOtpResponse otpBlocking(OtpEntity e){
        return SendOtpResponse.builder().otpStatus(e.getStatus()).blockTime(DateFormatter.dateFormatters(e.getBlockTime())).build();
    }
}
