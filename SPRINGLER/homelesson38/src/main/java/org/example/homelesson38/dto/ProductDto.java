package org.example.homelesson38.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Data
public class ProductDto {
    private Long count;
    private Long max;
    private BigDecimal avg;
}
