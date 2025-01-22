package org.example.forignkeytest.dao.entity;

import jakarta.persistence.*;
import org.example.forignkeytest.dao.repository.CategoryRepository;

import java.util.List;

@Entity()
@Table( name = "product1")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "product", cascade = CascadeType.DETACH)
    private List<Category> categories;
}
