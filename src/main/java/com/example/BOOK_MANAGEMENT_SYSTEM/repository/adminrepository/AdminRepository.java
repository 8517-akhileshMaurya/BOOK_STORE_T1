package com.example.BOOK_MANAGEMENT_SYSTEM.repository.adminrepository;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByAdminUsername(String username);
    }