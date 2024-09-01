package com.example.BOOK_MANAGEMENT_SYSTEM.Service.user;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.Users;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.feedback.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
