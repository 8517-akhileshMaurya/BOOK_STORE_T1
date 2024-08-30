package com.example.BOOK_MANAGEMENT_SYSTEM.repository.ProductRepository;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}