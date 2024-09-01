package com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel.Order;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel.OrderItem;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "product_id")
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

}

