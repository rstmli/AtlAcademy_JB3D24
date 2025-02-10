package az.otp.otp.service;

import az.otp.otp.dto.SendOtpRequest;
import az.otp.otp.dto.SendOtpResponse;

public interface OtpService {
  SendOtpResponse sendOtp(SendOtpRequest sendOtpRequest);
}
