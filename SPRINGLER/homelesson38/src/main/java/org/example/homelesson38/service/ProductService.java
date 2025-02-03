package org.example.homelesson38.service;

import org.example.homelesson38.dao.entity.ProductEntity;
import org.example.homelesson38.dto.*;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService{
    void addProduct(ProductRequestDto dto);
    List<ProductResponseDto> findPrice(BigDecimal price);
    List<ProductResponseDto> findName(String name);
    Long findProductCount();
    BigDecimal findMaxPrice();
    List<ProductResponseDto> findOrderByCreatedAt();
    BigDecimal findAvgPrice();
    List<ProductNameAndPriceDTO> findNameAndPrice();
    List<ProductResponseDto> findCreatedAt(String createdat);
    List<String> getDistintProduct();
    ProductResponseDto getmax();
    List<JoinDto> getjoin();
}
