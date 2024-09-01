package com.example.BOOK_MANAGEMENT_SYSTEM.repository.customerdetails;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long> {
    Optional<CustomerDetails> findByUserId(Long userId);
}
