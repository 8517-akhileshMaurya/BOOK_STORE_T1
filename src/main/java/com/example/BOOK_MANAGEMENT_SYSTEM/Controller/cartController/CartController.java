package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.cartController;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.cartService.CartService;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.cartModel.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/")
    public List<Cart> viewCart(){
        return cartService.viewCart();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        cartService.deleteCartItem(id);
        return "product deleted";
    }


    @PostMapping("/add")
    public Cart addProductToCart(@RequestParam Long user_id, @RequestParam Long product_id, @RequestParam Integer quantity ) {
        return cartService.addProductToCart(user_id, product_id, quantity);
    }
}

