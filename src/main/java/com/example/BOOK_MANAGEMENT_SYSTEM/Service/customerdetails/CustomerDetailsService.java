package com.example.BOOK_MANAGEMENT_SYSTEM.Service.customerdetails;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.CustomerDetails;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.customerdetails.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailsService {
    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    public CustomerDetails getCustomerDetailsByUserId(Long userId) {
        return customerDetailsRepository.findByUserId(userId);
    }

    public CustomerDetails updateCustomerDetails(CustomerDetails customerDetails) {
        return customerDetailsRepository.save(customerDetails);
    }
}
