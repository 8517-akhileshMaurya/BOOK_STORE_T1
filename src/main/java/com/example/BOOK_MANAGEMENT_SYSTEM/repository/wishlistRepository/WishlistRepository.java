package com.example.BOOK_MANAGEMENT_SYSTEM.repository.wishlistRepository;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.wishlistModel.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

}
