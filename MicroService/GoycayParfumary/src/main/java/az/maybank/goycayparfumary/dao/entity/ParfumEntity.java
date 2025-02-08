package az.maybank.goycayparfumary.dao.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@Table(name = "parfume")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParfumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Boolean qram;
    private Boolean paket;
    private BigDecimal price;
    private Long stock;

}
