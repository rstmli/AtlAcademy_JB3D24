package az.maybank.alivenino.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Builder
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AliveninoResponseDto {
    private String name;
    private Long stock;
    private BigDecimal price;
}
