package az.maybank.books.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LibrafDto {
    private String name;
    private String author;
    private Long stock;
    private BigDecimal price;
}
