package org.example.product.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.product.dto.ProductRequestDto;
import org.example.product.dto.ProductResponseDto;
import org.example.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

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
        return productService.getAllProduct(dto);
    }

    @GetMapping("/get/{id}")
    public ProductResponseDto getByIdPRoduct(@PathVariable Long id){
        return productService.getByIdProduct(id);
    }

    @PostMapping("/update/{id}")
    public Long updateProduct(@RequestBody ProductResponseDto dto, @PathVariable Long id){
        return productService.updateProduct(dto,id);
    }
}
