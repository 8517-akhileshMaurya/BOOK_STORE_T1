package com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel.Product;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
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
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int totalOrderAmount;
    private String orderStatus;
    private LocalDateTime createdAt = LocalDateTime.now() ;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "order")
    private List<OrderItem> orderItems;
    @ManyToOne(fetch = FetchType.EAGER)
    private Users user;
}



