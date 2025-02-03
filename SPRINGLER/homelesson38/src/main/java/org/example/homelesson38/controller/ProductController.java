package org.example.homelesson38.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.homelesson38.dto.*;
import org.example.homelesson38.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
@Data
public class ProductController {
    private final ProductService productService;

    @PostMapping("/post")
    public void addProduct(@RequestBody ProductRequestDto dto){
        productService.addProduct(dto);
    }

    @GetMapping("getprice")
    public List<ProductResponseDto> getPrice(@RequestParam BigDecimal price){
        return productService.findPrice(price);
    }

    @GetMapping("getname")
    public List<ProductResponseDto> findName(@RequestParam String name){
        return productService.findName(name);
    }

    @GetMapping("allProductCount")
    public String getProductAll(){
        return "Conut: " + productService.findProductCount();
    }

    @GetMapping("maxprice")
    public String getMaxPrice(){
        return "Max price: " + productService.findMaxPrice();
    }

    @GetMapping("orderbycreatedat")
    public List<ProductResponseDto> getOrderByCreatedAt(){
        return productService.findOrderByCreatedAt();
    }

    @GetMapping("avg")
    public String getAvgProduct(){
        return "AVG: " + productService.findAvgPrice();
    }
    @GetMapping("/nameandprice")
    public List<ProductNameAndPriceDTO> getNameAndPrice(){
        return productService.findNameAndPrice();
    }

    @GetMapping("getcreatedat")
    public List<ProductResponseDto> GetCreatedAt(@RequestParam String createdat){
        return productService.findCreatedAt(createdat);
    }

    @GetMapping("/distint")
    public List<String> getDistintProduct(){
        return productService.getDistintProduct();
    }

    @GetMapping("/maxproduct")
    public  ProductResponseDto getmax(){
        return productService.getmax();
    }

    @GetMapping("getjoin")
    public List<JoinDto> getjoin(){
        return productService.getjoin();
    }



}
