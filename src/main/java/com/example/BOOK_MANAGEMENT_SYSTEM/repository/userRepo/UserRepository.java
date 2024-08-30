package com.example.BOOK_MANAGEMENT_SYSTEM.repository.userRepo;


import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}