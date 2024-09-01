package com.example.BOOK_MANAGEMENT_SYSTEM.Exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
