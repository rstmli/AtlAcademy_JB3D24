package az.maybank.libraf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@Component
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LibrafResponseDto {
    private String name;
    private String author;
    private Long stock;
    private BigDecimal price;
}