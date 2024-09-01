package com.example.BOOK_MANAGEMENT_SYSTEM.repository.cartRepository;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.cartModel.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
