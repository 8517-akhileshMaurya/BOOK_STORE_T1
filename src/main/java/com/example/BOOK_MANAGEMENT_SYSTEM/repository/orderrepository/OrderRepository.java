package com.example.BOOK_MANAGEMENT_SYSTEM.repository.orderrepository;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
