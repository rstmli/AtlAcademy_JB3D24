package tr.student.ogrencikayit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import tr.student.ogrencikayit.util.Gender;

@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OgrenciResponseDto {
    private String name;
    private String surname;
    private Gender gender;
}
