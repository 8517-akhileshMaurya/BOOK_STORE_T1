package com.example.BOOK_MANAGEMENT_SYSTEM.Service.wishliaService;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel.Product;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.wishlistModel.Wishlist;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.ProductRepository.ProductRepository;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.userRepo.userRepository;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.wishlistRepository.WishlistRepository;
import com.example.BOOK_MANAGEMENT_SYSTEM.response.wishlistResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    @Autowired
    private userRepository userRepository;

    @Autowired
    private ProductRepository productRepository;


    public wishlistResponse addProductToWishlist(Long user_id, Long product_id, Integer quantity) {
        Users user = userRepository.findById(user_id).orElseThrow(() -> new RuntimeException("User not found"));
        Product product = productRepository.findById(product_id).orElseThrow(() -> new RuntimeException("Product not found"));

        Wishlist wishlist = new Wishlist();
        wishlist.setUser_id(user.getUser_id());
        wishlist.setWishlist_id(wishlist.getWishlist_id());

        wishlistRepository.save(wishlist);

        wishlistResponse wr = new wishlistResponse();
        wr.setUser_id(user.getUser_id());
        wr.setProduct_id(product.getProduct_id());
        wr.setWishlist_id(wishlist.getWishlist_id());
        return wr;

    }
}
