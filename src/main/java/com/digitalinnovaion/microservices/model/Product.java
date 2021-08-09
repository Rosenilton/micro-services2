package com.digitalinnovaion.microservices.model;

import io.micrometer.core.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "COLUMN_DESCRIPTION", length = 100, nullable = false)
    private final String drescription;

    @Column(name = "AMOUNT", nullable = false)
    private final BigDecimal amount;

    public Product(@NonNull String drescription,@NonNull BigDecimal amount) {
        this.drescription = Objects.requireNonNull(drescription);
        this.amount = Objects.requireNonNull(amount);
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return drescription;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
