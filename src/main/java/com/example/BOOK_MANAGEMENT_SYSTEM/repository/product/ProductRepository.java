package com.example.BOOK_MANAGEMENT_SYSTEM.repository.product;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}