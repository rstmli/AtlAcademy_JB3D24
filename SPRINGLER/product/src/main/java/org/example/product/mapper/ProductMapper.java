package org.example.product.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.util.ProcessIdUtil;
import org.example.product.dao.entity.ProductEntity;
import org.example.product.dto.ProductRequestDto;
import org.example.product.dto.ProductResponseDto;
import org.example.product.util.ProductDateUtil;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@Builder
@NoArgsConstructor
public class ProductMapper {
    public List<ProductRequestDto> addProduct(List<ProductEntity> entity){
        List<ProductRequestDto> dtos = new ArrayList<>();

        for(ProductEntity e : entity){
            var dto = ProductRequestDto.builder().name(e.getName()).price(e.getPrice()).build();
            dtos.add(dto);
        }
        return dtos;

    }

    public List<ProductResponseDto> getProduct(List<ProductEntity> entities){
        List<ProductResponseDto> dtos = new ArrayList<>();
        for(ProductEntity e : entities){
            var dto = ProductResponseDto.builder().name(e.getName()).price(e.getPrice()).created_at(ProductDateUtil.getFormetter(e.getCreated_at(),false)).update_at(ProductDateUtil.getFormetter(e.getUpdate_at(),false)).build();
            dtos.add(dto);
        }
        return dtos;
    }

    public ProductResponseDto getByIdToList(ProductEntity e){
        var dto = ProductResponseDto.builder().name(e.getName()).price(e.getPrice()).build();
        return dto;
    }
}
