package com.example.BOOK_MANAGEMENT_SYSTEM.Service.orderservice;/*
package com.example.BOOK_MANAGEMENT_SYSTEM.Service.orderservice;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel.Order;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.orderrepository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order orderRequest) {
        // Logic to process the order
        Order order = new Order();
        order.setUser_id(orderRequest.getUser_id());
        order.setTotal_amount(orderRequest.getTotal_amount());
        order.setOrder_status("CONFIRMED");
        return orderRepository.save(order);
    }

    public List<Order> getOrderHistory(Long userId) {
        return orderRepository.findByUserId(userId);
    }
}
*/
