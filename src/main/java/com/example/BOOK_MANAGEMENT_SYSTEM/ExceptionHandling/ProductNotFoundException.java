package com.example.BOOK_MANAGEMENT_SYSTEM.ExceptionHandling;


public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
