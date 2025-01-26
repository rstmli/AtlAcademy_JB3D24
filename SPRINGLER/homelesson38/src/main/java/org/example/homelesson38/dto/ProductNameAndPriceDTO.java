package org.example.homelesson38.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@Component
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductNameAndPriceDTO {
    private String name;
    private BigDecimal price;

   }
