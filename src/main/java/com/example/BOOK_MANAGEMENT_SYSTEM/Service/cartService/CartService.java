package com.example.BOOK_MANAGEMENT_SYSTEM.Service.cartService;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.cartModel.Cart;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel.Product;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.ProductRepository.ProductRepository;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.cartRepository.CartRepository;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.userRepo.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private userRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    //view
    public List<Cart> viewCart(){
        return cartRepository.findAll();
    }

    //delete
    public void deleteCartItem(Long id){
        cartRepository.deleteById(id);
    }


    public Cart addProductToCart(Long user_id, Long product_id, Integer quantity) {
        Users user = userRepository.findById(user_id).orElseThrow(() -> new RuntimeException("User not found"));
        Product product = productRepository.findById(product_id).orElseThrow(() -> new RuntimeException("Product not found"));

        Cart cart = new Cart();
        cart.setUser(user);
        cart.setProduct(product);
        cart.setQuantity(quantity);
        cart.setUser_id(user_id);
        cart.setProduct_id(product_id);

        return cartRepository.save(cart);





    }
}

