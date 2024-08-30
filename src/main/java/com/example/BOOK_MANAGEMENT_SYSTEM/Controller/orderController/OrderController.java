package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.orderController;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.orderService.OrderService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.cartModel.Cart;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiForOrder")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping()
    public Order makeOrder(@RequestParam Long user_id , @RequestParam Long product_id , @RequestParam Integer quantity , @RequestParam String order_status){
        return orderService.makeOrder(user_id , product_id ,quantity  , order_status );
    }


//    @PostMapping("/add")
//    public Cart addProductToCart(@RequestParam Long user_id, @RequestParam Long product_id, @RequestParam Integer quantity) {
//        return cartService.addProductToCart(user_id, product_id, quantity);
//    }
}
