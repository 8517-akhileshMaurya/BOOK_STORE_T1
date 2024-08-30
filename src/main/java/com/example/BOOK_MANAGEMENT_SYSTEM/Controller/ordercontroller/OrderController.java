package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.ordercontroller;/*
package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.ordercontroller;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.orderservice.OrderService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order placeOrder(@RequestBody Order orderRequest) {
        return orderService.placeOrder(orderRequest);
    }

    @GetMapping("/history")
    public List<Order> getOrderHistory(@RequestParam Long userId) {
        return orderService.getOrderHistory(userId);
    }
}
*/
