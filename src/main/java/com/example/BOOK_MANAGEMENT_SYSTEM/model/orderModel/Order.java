package com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel.Product;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
//@AllArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

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

    private int total_amount;

    @Column(nullable = false)
    private String order_status;

    @Column(name = "created_at")
    private LocalDateTime created_at = LocalDateTime.now() ;


}



