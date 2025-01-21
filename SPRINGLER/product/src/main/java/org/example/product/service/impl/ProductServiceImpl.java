package org.example.product.service.impl;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.product.dao.entity.ProductEntity;
import org.example.product.dao.repository.ProductRepository;
import org.example.product.dto.ProductRequestDto;
import org.example.product.dto.ProductResponseDto;
import org.example.product.mapper.ProductMapper;
import org.example.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@RequiredArgsConstructor
@Builder
public class ProductServiceImpl implements ProductService {
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;
    @Override
    public void addProduct(ProductRequestDto dto) {
        ProductEntity productEntity = ProductEntity.builder().name(dto.getName()).price(dto.getPrice()).build();
        productRepository.save(productEntity);

    }

    @Override
    public List<ProductResponseDto> getAllProduct(ProductResponseDto dto) {
        List<ProductEntity> entity = productRepository.findAll();
        return productMapper.getProduct(entity) ;
    }

    @Override
    public ProductResponseDto getByIdProduct(Long id) {
        Optional<ProductEntity> optionalProductEntity = productRepository.findById(id);
        ProductEntity entity = ProductEntity.builder().build();
        if(optionalProductEntity.isPresent()){
            return productMapper.getByIdToList(optionalProductEntity.get());
        }
        return productMapper.getByIdToList(entity);
    }

    @Override
    public Long updateProduct(ProductResponseDto dto, Long id) {

        Optional<ProductEntity> optionalProductEntity = productRepository.findById(id);
        if(optionalProductEntity.isPresent()){
            ProductEntity entity = optionalProductEntity.get();
            entity.setName(dto.getName());
            entity.setPrice(dto.getPrice());
            productRepository.save(entity);
            return id;
        }


        return 0L;
    }


}
