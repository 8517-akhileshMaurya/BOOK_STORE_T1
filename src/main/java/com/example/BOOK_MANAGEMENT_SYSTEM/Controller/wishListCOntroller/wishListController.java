package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.wishListCOntroller;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.wishliaService.WishlistService;
import com.example.BOOK_MANAGEMENT_SYSTEM.response.wishlistResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class wishListController {

    @Autowired
    private WishlistService wishlistService;

    @PostMapping("/wishlist/add")
    public wishlistResponse addProductToWishlist(@RequestBody Long user_id, @RequestBody Long product_id, @RequestBody Integer quantity){
        return wishlistService.addProductToWishlist(user_id, product_id, quantity);
    }
}