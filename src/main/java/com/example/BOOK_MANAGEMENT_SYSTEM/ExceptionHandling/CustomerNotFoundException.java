package com.example.BOOK_MANAGEMENT_SYSTEM.ExceptionHandling;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
