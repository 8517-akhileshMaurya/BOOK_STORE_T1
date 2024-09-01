package com.example.BOOK_MANAGEMENT_SYSTEM.repository.orderrepository;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.orderModel.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<Order, Long> {

}
