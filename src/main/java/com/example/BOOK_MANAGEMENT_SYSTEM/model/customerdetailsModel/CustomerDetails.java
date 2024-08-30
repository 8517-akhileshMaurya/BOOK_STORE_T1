package com.example.BOOK_MANAGEMENT_SYSTEM.model.customerdetailsModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class CustomerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerDetails_id;


    private Long user_id;
    private String name;
    private String email;
    private String address;
    private String phone_number;
    @Column(name = "created_at")
    private LocalDateTime created_at = LocalDateTime.now();



}
