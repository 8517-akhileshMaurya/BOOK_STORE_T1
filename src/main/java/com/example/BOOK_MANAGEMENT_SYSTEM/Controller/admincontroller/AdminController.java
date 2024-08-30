package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.admincontroller;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.ProductService.ProductService;
import com.example.BOOK_MANAGEMENT_SYSTEM.Service.adminservice.AdminService;
import com.example.BOOK_MANAGEMENT_SYSTEM.exceptions.ProductNotFoundException;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel.Admin;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.productModel.Product;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookstore/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private ProductService productService;



    @GetMapping("/all")
    public List<Admin> getAllAdmin() {
        return adminService.getAllAdmin();
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginAdmin(@RequestBody Admin admin) {
        boolean isAuthenticated = adminService.authenticateAdmin(admin.getAdminUsername(), admin.getAdminPassword());
        if (isAuthenticated) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerAdmin(@RequestBody Admin admin) {
        adminService.registerAdmin(admin);
        return ResponseEntity.ok("Admin registered successfully");
    }

    @PutMapping("/update/book/{product_id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long product_id,@RequestBody Product product) throws ProductNotFoundException {
        if (productService.getAllProducts().stream().noneMatch(p -> p.getProduct_id() == product_id)) {
            throw new ProductNotFoundException("Product with id " + product_id + " not found");
        } else {
            product.setProduct_id(product_id);
            return new ResponseEntity<>(productService.updateProduct(product), HttpStatus.OK);
        }
    }

    @GetMapping("/all/books")
    public List<Product> getAllBooks(){
        return productService.getAllProducts();
    }

    @PostMapping("/add/book")
    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) {
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }



    @DeleteMapping("/delete/book/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable long id) throws ProductNotFoundException {
        if (productService.getAllProducts().stream().noneMatch(product -> product.getProduct_id() == id)) {
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }else {
            productService.deleteProduct(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}