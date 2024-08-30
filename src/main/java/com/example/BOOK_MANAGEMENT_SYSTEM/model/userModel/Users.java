package com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class Users{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

   @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(name = "created_at" )
    private LocalDateTime created_at = LocalDateTime.now();

    public Users() {
    }
}

