package org.example.product.dao.repository;

import lombok.*;
import org.example.product.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
