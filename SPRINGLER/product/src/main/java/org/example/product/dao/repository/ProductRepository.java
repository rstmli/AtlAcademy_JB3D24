package org.example.product.dao.repository;

import lombok.*;
import org.example.product.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {


    @Query(value = "SELECT * FROM product", nativeQuery = true)
    public List<ProductEntity> getgetirbutuntable();

    @Query(value = "SELECT * FROM product WHERE price > :price", nativeQuery = true)
    public List<ProductEntity> getgetirboyukdur60(@Param("price") BigDecimal price);

    @Modifying
    @Query(value = "UPDATE product set name = :name where id = :id ",nativeQuery = true)
    void updatename(@Param("name") String name, @Param("id") Long id);

    @Modifying
    @Query(value = "delete from product where id = :id", nativeQuery = true)
    void deleteProduct(@Param("id") Long id);

    @Query(value = "select * from product where price > :price",nativeQuery = true)
    List<ProductEntity> getPriceProduct(@Param("price") BigDecimal price);

}

// Bu sorğu müəyyən qiymət aralığında olan məhsulları gətirir.