package com.example.BOOK_MANAGEMENT_SYSTEM.model.wishlistModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class wishlistItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wishlistITem_id;

    private Long wishlist_id;
    private Long product_id;

    @Column(name = "created_at")
    private LocalDateTime created_at;

}
