package az.otp.otp.controller;

import az.otp.otp.dto.SendOtpRequest;
import az.otp.otp.dto.SendOtpResponse;
import az.otp.otp.service.OtpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/otpservice")
@RequiredArgsConstructor
public class OtpController {
    private final OtpService otpService;

    @PostMapping()
    public SendOtpResponse postOtp(@RequestBody SendOtpRequest sendOtpRequest){
        return otpService.sendOtp(sendOtpRequest);
    }
}
