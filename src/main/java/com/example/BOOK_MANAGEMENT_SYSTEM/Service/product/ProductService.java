package com.example.BOOK_MANAGEMENT_SYSTEM.Service.product;

import com.example.BOOK_MANAGEMENT_SYSTEM.ExceptionHandling.ProductNotFoundException;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.Product;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
