package com.example.BOOK_MANAGEMENT_SYSTEM.model.cartModel;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel.Product;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity

public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cart_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(insertable=false, updatable=false)
    private Long user_id;

    @Column(insertable=false, updatable=false)
    private Long product_id;

    private int quantity;

    @Column(name = "created_at")
    private LocalDateTime created_at  = LocalDateTime.now();
}


