package az.maybank.goycayparfumary.controller;

import az.maybank.goycayparfumary.dto.ParfumRequestDto;
import az.maybank.goycayparfumary.dto.ParfumResponseDto;
import az.maybank.goycayparfumary.service.ParfumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/parfum")
public class ParfumController {
    private final ParfumService parfumService;
    @PostMapping("/post")
    public ResponseEntity<Void> post(@RequestBody ParfumRequestDto dto){
        parfumService.addParfum(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("/get")
    public List<ParfumResponseDto> getAll(){
        return parfumService.getAll();
    }

    @GetMapping("/get/{id}")
    public ParfumResponseDto getById(@PathVariable Long id){
        return parfumService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public ParfumResponseDto delete(@PathVariable Long id){
        return parfumService.deleteParfum(id);
    }

}
