package com.example.BOOK_MANAGEMENT_SYSTEM.model.wishlistModel;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wishlist_id;

    @Column(insertable=false, updatable=false)
    private Long user_id;


    @Column(nullable = false, name = "created_at")
    private LocalDateTime created_at;

    @OneToMany(mappedBy = "wishlist", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<wishlistItem> wishlistItemsList;

}
