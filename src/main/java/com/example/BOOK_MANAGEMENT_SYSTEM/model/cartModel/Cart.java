package com.example.BOOK_MANAGEMENT_SYSTEM.model.cartModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cart_id;
    private Long user_id;
    @Column(name = "created_at")
    private LocalDateTime created_at  = LocalDateTime.now();

}


//id: Primary Key, auto-increment
//cart_id: Foreign Key (Cart), not null
//product_id: Foreign Key (Product), not null
//quantity: Integer, not null
