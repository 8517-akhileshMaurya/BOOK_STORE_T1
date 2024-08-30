package com.example.BOOK_MANAGEMENT_SYSTEM.repository.customerdetails;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long> {
    CustomerDetails findByUserId(Long userId);
}
