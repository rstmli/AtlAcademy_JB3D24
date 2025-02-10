package az.otp.otp.dto;

import az.otp.otp.util.enums.OtpStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class SendOtpResponse {
    private OtpStatus otpStatus;

    // Use @JsonInclude to ensure the fields are not serialized when not needed
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String blockTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String expireTime;

}

