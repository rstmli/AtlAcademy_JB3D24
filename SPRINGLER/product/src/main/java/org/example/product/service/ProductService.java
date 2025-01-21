package org.example.product.service;

import org.example.product.dto.ProductRequestDto;
import org.example.product.dto.ProductResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    void addProduct(ProductRequestDto dto);
    List<ProductResponseDto> getAllProduct(ProductResponseDto dto);
    ProductResponseDto getByIdProduct(Long id);
    Long updateProduct(ProductResponseDto dto , Long id);
}

