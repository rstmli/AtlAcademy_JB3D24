package org.example.homelesson38.service.impl;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.homelesson38.dao.entity.ProductEntity;
import org.example.homelesson38.dao.repository.ProductRepository;
import org.example.homelesson38.dto.ProductNameAndPriceDTO;
import org.example.homelesson38.dto.ProductNameDto;
import org.example.homelesson38.dto.ProductRequestDto;
import org.example.homelesson38.dto.ProductResponseDto;
import org.example.homelesson38.mapper.ProductMaper;
import org.example.homelesson38.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMaper productMaper;


    @Override
    public void addProduct(ProductRequestDto dto) {
        var entity = ProductEntity.builder().name(dto.getName()).price(dto.getPrice()).build();
        productRepository.save(entity);
    }

    @Override
    public List<ProductResponseDto> findPrice(BigDecimal price) {
        return productMaper.entityToDto(productRepository.getPice(price));
    }

    @Override
    public List<ProductResponseDto> findName(String name) {
        return productMaper.entityToDto(productRepository.getName(name));
    }
    @Override
    public Long findProductCount(){
        return productRepository.getProductCount();
    }

    @Override
    public BigDecimal findMaxPrice() {
        return productRepository.getMaxPrice();
    }

    @Override
    public List<ProductResponseDto> findOrderByCreatedAt() {
        return productMaper.entityToDto(productRepository.getOrderByCreatedAt());
    }

    @Override
    public BigDecimal findAvgPrice() {
        return productRepository.getAvgPrice();
    }

    @Override
    public List<ProductNameAndPriceDTO> findNameAndPrice() {
        return productMaper.nameandprice(productRepository.getNameAndPrice());
    }

    @Override
    public List<ProductResponseDto> findCreatedAt(String createdat) {
        return productMaper.entityToDto(productRepository.getCreatedAt(createdat));
    }

    @Override
    public List<String> getDistintProduct() {
        return productRepository.getDistintProduct();
    }
}
