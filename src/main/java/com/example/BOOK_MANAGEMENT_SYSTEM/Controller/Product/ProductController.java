package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.Product;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.product.ProductService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookstore_user/admin")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add/book")
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Product Added";
    }

    @PutMapping("/update/book/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        productService.updateProduct(product);
        return "Product updated";
    }

    @DeleteMapping("/delete/book/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "Product deleted";
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}