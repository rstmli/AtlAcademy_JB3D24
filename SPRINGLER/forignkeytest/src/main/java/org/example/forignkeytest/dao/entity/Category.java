package org.example.forignkeytest.dao.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.BindParam;

import java.math.BigDecimal;

@Entity
@Table(name = "category")
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "category_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
