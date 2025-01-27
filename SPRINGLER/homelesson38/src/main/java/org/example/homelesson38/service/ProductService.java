package org.example.homelesson38.service;

import org.example.homelesson38.dto.ProductNameAndPriceDTO;
import org.example.homelesson38.dto.ProductNameDto;
import org.example.homelesson38.dto.ProductRequestDto;
import org.example.homelesson38.dto.ProductResponseDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
}
