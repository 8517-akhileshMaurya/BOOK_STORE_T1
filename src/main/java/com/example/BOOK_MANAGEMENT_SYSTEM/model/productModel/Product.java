package com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    private String name;
    private String description;
    private double price;
    private int stock;
    @Column(name = "created_at")
    private LocalDateTime created_at = LocalDateTime.now();

    public Product() {
    }
}

