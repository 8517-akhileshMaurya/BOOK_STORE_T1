package com.example.BOOK_MANAGEMENT_SYSTEM.repository.productmanagingandaccessing;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductManagingAndAccessingRepository extends JpaRepository<Product,Long> {
    List<Product> findByNameContainingOrAuthorContaining(String name, String author);
}
