package com.example.BOOK_MANAGEMENT_SYSTEM.model.wishlistModel;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wishlist_id;

    private Long user_id;
    @Column(name = "created_at")
    private LocalDateTime created_at;

}
