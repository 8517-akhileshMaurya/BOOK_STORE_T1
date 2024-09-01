package com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel.Product;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private float price;
    private LocalDateTime createdAt = LocalDateTime.now();
    @ManyToOne(fetch = FetchType.EAGER)
    private Order order;

}
