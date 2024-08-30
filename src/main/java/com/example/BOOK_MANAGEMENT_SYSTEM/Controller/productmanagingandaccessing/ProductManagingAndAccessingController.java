package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.productmanagingandaccessing;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.productmanagingandaccessing.ProductManagingAndAccessingService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book_store/user/products")
public class ProductManagingAndAccessingController {
    @Autowired
    private ProductManagingAndAccessingService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String keyword) {
        return productService.searchProducts(keyword);
    }
}
