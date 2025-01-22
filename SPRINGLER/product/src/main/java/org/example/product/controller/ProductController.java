package org.example.product.controller;

import lombok.Data;
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
}
