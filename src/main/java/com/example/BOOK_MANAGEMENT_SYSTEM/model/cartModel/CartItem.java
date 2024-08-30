package com.example.BOOK_MANAGEMENT_SYSTEM.model.cartModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItem_id;

    private Long cart_id;
    private Long product_id;
    private Long quantity;

    @Column(name = "created_at")
    private LocalDateTime created_at = LocalDateTime.now();
}
