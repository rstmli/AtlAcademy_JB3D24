package az.maybank.goycayparfumary.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ParfumRequestDto {
    private String name;
    private Boolean qram;
    private Boolean paket;
    private BigDecimal price;
    private Long stock;
}
