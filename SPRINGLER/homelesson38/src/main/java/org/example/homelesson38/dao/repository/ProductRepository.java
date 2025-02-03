package org.example.homelesson38.dao.repository;

import org.example.homelesson38.dao.entity.ProductEntity;
import org.example.homelesson38.dto.JoinDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    @Query(value = "select * from product where price > :price",nativeQuery = true)
    List<ProductEntity> getPice(@Param("price")BigDecimal price);

    @Query(value = "select * from product where name like %:name%",nativeQuery = true)
    List<ProductEntity> getName(@Param("name")String name);

    @Query(value = "select count(name) as count from product",nativeQuery = true)
    Long getProductCount();

    @Query(value = "select MAX(price) as max from product",nativeQuery = true)
    BigDecimal getMaxPrice();

    @Query(value = "select * from product order by price DESC limit 1",nativeQuery = true)
    ProductEntity getmax();

    @Query(value = "select * from product order by created_at DESC limit 10",nativeQuery = true)
    List<ProductEntity>getOrderByCreatedAt();

    @Query(value = "select AVG(price) as avg from product",nativeQuery = true)
    BigDecimal getAvgPrice();

    @Query(value = "select * from product", nativeQuery = true)
    List<ProductEntity> getNameAndPrice();

    @Query(value = "select * from product where TO_CHAR(created_at, 'YYYY-MM-dd') LIKE %:createdat%",nativeQuery = true)
    List<ProductEntity> getCreatedAt(@Param("createdat") String createdat);

    @Query(value = "select distinct name as name from product", nativeQuery = true)
    List<String> getDistintProduct();

    @Query(value = "select p.name as nameProduct, c.name as nameCategory from product p left join public.category c on c.id = p.category_id", nativeQuery = true)
    List<JoinDto> findProductAndCategoryNames();


}

