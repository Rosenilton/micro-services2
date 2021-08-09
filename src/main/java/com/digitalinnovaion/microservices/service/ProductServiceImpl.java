package com.digitalinnovaion.microservices.service;

import com.digitalinnovaion.microservices.model.Product;
import com.digitalinnovaion.microservices.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{


    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product product){
        return productRepository.save(product);
    }
}
