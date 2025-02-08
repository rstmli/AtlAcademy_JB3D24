package az.maybank.goycayparfumary.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParfumResponseDto {
    private String name;
    private Boolean qram;
    private Boolean paket;
    private BigDecimal price;
    private Long stock;
}
