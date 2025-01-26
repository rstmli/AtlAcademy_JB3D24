package org.example.product.controller;

import jakarta.transaction.Transactional;
import lombok.Data;
import org.example.product.dao.entity.ProductEntity;
import org.example.product.dto.ProductRequestDto;
import org.example.product.dto.ProductResponseDto;
import org.example.product.dto.UpdateRequestDto;
import org.example.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@Data
@RequestMapping("api/v1/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/post")
    public void postStudent(@RequestBody ProductRequestDto dto){
        productService.addProduct(dto);
    }

    @GetMapping("/get")
    public List<ProductResponseDto> getProduct(ProductResponseDto dto){
        return productService.getAllProduct();
    }

    @GetMapping("/get/{id}")
    public ProductResponseDto getByIdPRoduct(@PathVariable Long id){
        return productService.getByIdProduct(id);
    }

    @PatchMapping("/update/{id}")
    public Long updateProduct(@RequestBody ProductResponseDto dto, @PathVariable Long id){
        return productService.updateProduct(dto,id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        productService.deleteAllProductTable(id);
    }

    @GetMapping("/getir")
    public List<ProductResponseDto> getirtable(){
        return productService.getGetirAllTable();
    }

    @GetMapping("/getir2")
    public List<ProductResponseDto> getir60danboyuk(@RequestParam BigDecimal price){
        return productService.getgetir60danboyukleri(price);
    }
    @Transactional
    @PutMapping("/update2/{id}")
    public void updateNames(@RequestBody UpdateRequestDto dto, @PathVariable Long id){
        productService.updateNames(dto,id);
    }

    @Transactional
    @DeleteMapping("/delete2")
    public void deleteProduct(@RequestParam Long id){
        productService.delelteproduct(id);
    }

    @GetMapping("getir")
    public List<ProductResponseDto> findProductPrice(@RequestParam BigDecimal price){
        return productService.productPrice(price);
    }
}
