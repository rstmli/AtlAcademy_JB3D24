package org.example.homelesson38.mapper;

import lombok.*;
import org.example.homelesson38.dao.entity.ProductEntity;
import org.example.homelesson38.dto.ProductNameAndPriceDTO;
import org.example.homelesson38.dto.ProductNameDto;
import org.example.homelesson38.dto.ProductResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Builder
@AllArgsConstructor
public class ProductMaper {
    public List<ProductResponseDto> entityToDto(List<ProductEntity> entities){
        List<ProductResponseDto> dtos = new ArrayList<>();

        for(ProductEntity e : entities){
            ProductResponseDto dto = ProductResponseDto.builder()
                    .name(e.getName())
                    .price(e.getPrice())
                    .created_At(e.getCreated_At())
                    .updated_At(e.getUpdated_At())
                    .build();
            dtos.add(dto);
        }
        return dtos;
    }
    public List<ProductNameAndPriceDTO> nameandprice(List<ProductEntity> entities){
        List<ProductNameAndPriceDTO> dtos = new ArrayList<>();

        for(ProductEntity e : entities){
            ProductNameAndPriceDTO dto = ProductNameAndPriceDTO.builder()
                    .name(e.getName())
                    .price(e.getPrice())
                    .build();
            dtos.add(dto);
        }
        return dtos;
    }

    public List<ProductNameDto> getDistintProduct(List<ProductEntity> entities){
        List<ProductNameDto> dtos = new ArrayList<>();

        for(ProductEntity e : entities){
            ProductNameDto dto = ProductNameDto.builder()
                    .name(e.getName())
                    .build();
            dtos.add(dto);
        }
        return dtos;
    }

    public ProductResponseDto entityToListDto(ProductEntity entity){
        var dto = ProductResponseDto.builder().name(entity.getName()).price(entity.getPrice()).created_At(entity.getCreated_At()).updated_At(entity.getUpdated_At()).build();
        return dto;
    }




}
