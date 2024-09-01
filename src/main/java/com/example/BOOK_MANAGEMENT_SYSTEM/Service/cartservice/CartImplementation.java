/*
package com.example.BOOK_MANAGEMENT_SYSTEM.Service.cartservice;
package com.example.BOOK_MANAGEMENT_SYSTEM.Service.cartservice;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.cartModel.CartItem;

import com.example.BOOK_MANAGEMENT_SYSTEM.repository.cartrepository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemService {
    @Autowired
    private CartItemRepository cartItemRepository;

    public CartItem addItemToCart(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public void removeItemFromCart(Long itemId) {
        cartItemRepository.deleteById(itemId);
    }

    public CartItem updateItemQuantity(Long itemId, int quantity) {
        CartItem cartItem = cartItemRepository.findById(itemId).orElseThrow(() -> new RuntimeException("Item not found"));
        cartItem.setQuantity(quantity);
        return cartItemRepository.save(cartItem);
    }
}
*/
