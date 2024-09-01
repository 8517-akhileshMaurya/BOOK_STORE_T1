package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.CustomerDetails;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.customerdetails.CustomerDetailsService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookstore_user/customer-details")
public class CustomerDetailsController {
    @Autowired
    private CustomerDetailsService customerDetailsService;

    @GetMapping("/user/{userId}")
    public CustomerDetails getCustomerDetailsByUserId(@PathVariable Long userId) {
        return customerDetailsService.getCustomerDetailsByUserId(userId);
    }

    @PutMapping("edit_user/{id}")
    public CustomerDetails updateCustomerDetails(@PathVariable Long id, @RequestBody CustomerDetails customerDetails) {
        customerDetails.setId(id);
        return customerDetailsService.updateCustomerDetails(customerDetails);
    }
}


