package com.example.BOOK_MANAGEMENT_SYSTEM.Service.adminservice;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel.Admin;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.adminrepository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    private BCryptPasswordEncoder encoder= new BCryptPasswordEncoder(10);

    @Override
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public void registerAdmin(Admin admin) {
        admin.setAdminPassword(encoder.encode(admin.getAdminPassword()));
        admin.setCreated_at(new Timestamp(System.currentTimeMillis()));
        adminRepository.save(admin);
    }

    @Override
    public boolean authenticateAdmin(String username, String password) {
        Admin admin = adminRepository.findByAdminUsername(username);
        return admin != null && admin.getAdminPassword().equals(password);
    }
}