package com.example.BOOK_MANAGEMENT_SYSTEM.repository.feedback;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

}