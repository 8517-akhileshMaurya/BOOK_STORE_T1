package com.example.BOOK_MANAGEMENT_SYSTEM.Service.productmanagingandaccessing;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.Product;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.productmanagingandaccessing.ProductManagingAndAccessingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManagingAndAccessingService {
    @Autowired
    private ProductManagingAndAccessingRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> searchProducts(String keyword) {
        return productRepository.findByNameContainingOrAuthorContaining(keyword, keyword);
    }
}
