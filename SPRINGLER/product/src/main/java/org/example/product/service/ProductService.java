package org.example.product.service;

import org.example.product.dao.entity.ProductEntity;
import org.example.product.dto.ProductRequestDto;
import org.example.product.dto.ProductResponseDto;
import org.example.product.dto.UpdateRequestDto;


import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    void addProduct(ProductRequestDto dto);
    List<ProductResponseDto> getAllProduct();
    ProductResponseDto getByIdProduct(Long id);
    Long updateProduct(ProductResponseDto dto , Long id);
    void deleteAllProductTable(Long id);
    List<ProductResponseDto> getGetirAllTable();
    List<ProductResponseDto> getgetir60danboyukleri(BigDecimal price);
    void updateNames(UpdateRequestDto dto,Long id);
    void delelteproduct(Long id);
    List<ProductResponseDto> productPrice(BigDecimal price);

}


