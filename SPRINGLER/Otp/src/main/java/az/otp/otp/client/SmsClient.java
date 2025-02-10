package az.otp.otp.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SmsClient {

    public void smsSender(String msisdn,String code){
        log.info("otp code: {}, msisdn: {}",code,msisdn);
    }
}
