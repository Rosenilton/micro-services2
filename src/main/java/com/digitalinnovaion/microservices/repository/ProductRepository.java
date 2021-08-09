package com.digitalinnovaion.microservices.repository;

import com.digitalinnovaion.microservices.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
