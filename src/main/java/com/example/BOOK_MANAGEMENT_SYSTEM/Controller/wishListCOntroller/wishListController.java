package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.wishListCOntroller;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.wishliaService.WishlistService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.cartModel.Cart;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.wishlistModel.Wishlist;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class wishListController {

    @Autowired
    private WishlistService wishlistService;






    @PostMapping("/wishlist/add")
    public Wishlist addProductToWishlist(@RequestParam Long user_id, @RequestParam Long product_id, @RequestParam Integer quantity){
        return wishlistService.addProductToWishlist(user_id, product_id, quantity);
    }
}