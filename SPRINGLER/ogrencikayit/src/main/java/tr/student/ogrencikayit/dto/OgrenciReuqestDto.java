package tr.student.ogrencikayit.dto;

import jdk.dynalink.NamedOperation;
import lombok.*;
import org.springframework.stereotype.Component;
import tr.student.ogrencikayit.util.Gender;

@Component
@Data
@RequiredArgsConstructor
public class OgrenciReuqestDto {
    private String name;
    private String surname;
    private Gender gender;
}
