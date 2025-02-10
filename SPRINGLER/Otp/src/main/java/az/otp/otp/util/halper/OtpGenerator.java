package az.otp.otp.util.halper;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class OtpGenerator {
    public String generete(){
        SecureRandom random = new SecureRandom();
        int otp = random.nextInt(100000);
        return String.format("%06d",otp);
    }
}
