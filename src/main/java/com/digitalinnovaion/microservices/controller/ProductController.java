package com.digitalinnovaion.microservices.controller;

import com.digitalinnovaion.microservices.dto.request.ProductPersistDto;
import com.digitalinnovaion.microservices.dto.response.ProductResponseDto;
import com.digitalinnovaion.microservices.model.Product;
import com.digitalinnovaion.microservices.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping
    public ProductResponseDto create(@RequestBody ProductPersistDto dto){
           Product product = new Product(dto.getDescription(), dto.getAmount());
           Product productPersist = productService.create(product);
           return new ProductResponseDto(productPersist.getId(), productPersist.getDescription());
    }
}
