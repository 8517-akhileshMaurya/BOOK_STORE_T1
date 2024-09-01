package com.example.BOOK_MANAGEMENT_SYSTEM.Service.orderService;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel.Order;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel.Product;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.ProductRepository.ProductRepository;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.orderRepository.OrderRepository;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.userRepo.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private userRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    public Order makeOrder(Long user_id, Long product_id, Integer quantity , String order_status){
        Users user = userRepository.findById(user_id).orElseThrow(() -> new RuntimeException("User not found"));
        Product product = productRepository.findById(product_id).orElseThrow(() -> new RuntimeException("Product not found"));

        Order order = new Order();
        order.setUser_id(user_id);
        order.setProduct_id(product_id);
        order.setOrder_status(order.getOrder_status());
        order.setUser(user);
        order.setProduct(product);
        order.setTotal_amount(order.getTotal_amount());

        return orderRepository.save(order);

    }
}
