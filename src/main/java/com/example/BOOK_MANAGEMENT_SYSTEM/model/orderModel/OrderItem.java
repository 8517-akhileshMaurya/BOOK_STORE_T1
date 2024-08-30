package com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel;/*
package com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItem_id;

    private Long order_id;
    private Long product_id;
    private int quantity;
    private float price;

    @Column(name = "created_at")
    private LocalDateTime created_at = LocalDateTime.now();
}

//id: Primary Key, auto-increment
//order_id: Foreign Key (Order), not null
//product_id: Foreign Key (Product), not null
//quantity: Integer, not null
//price: Decimal, not null*/
