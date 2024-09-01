package com.example.BOOK_MANAGEMENT_SYSTEM.Service.AdminService;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel.Admin;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.AdminRepository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAdmin(){
        return adminRepository.findAll();
    }

    public void registerAdmin(Admin admin){
        adminRepository.save(admin);
    }

    public String loginAdmin(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);
        if (admin != null && admin.getPassword().equals(password)) {
            return "admin present";
        }
        else{
            return "invalid admin";
        }
    }


    public boolean checkadmin(String username , String password) {
        int countt = (int) adminRepository.findAll().stream().filter((a)->{
            return a.getUsername().equals(username) && a.getPassword().equals(password);
        }).count();

        if (countt != 0){
            return true;
        }
        return false;
    }
}
