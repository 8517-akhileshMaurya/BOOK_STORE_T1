package com.example.BOOK_MANAGEMENT_SYSTEM.Service.userdetailsservice;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel.Admin;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel.AdminPrinciple;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.adminrepository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private AdminRepository adminRepo;

    @Override
    public UserDetails loadUserByUsername(String adminName) throws UsernameNotFoundException {

        Admin admin=adminRepo.findByAdminUsername(adminName);
        if(admin == null) {
            System.out.println("user not found");
            throw new UsernameNotFoundException("user not found");
        }

        return new AdminPrinciple(admin);
    }
}
