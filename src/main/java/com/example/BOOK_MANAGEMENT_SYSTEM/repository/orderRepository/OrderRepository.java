package com.example.BOOK_MANAGEMENT_SYSTEM.repository.orderRepository;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
