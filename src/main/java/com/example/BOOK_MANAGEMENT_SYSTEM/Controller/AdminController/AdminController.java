package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.AdminController;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.AdminService.adminService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.adminModel.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class AdminController {

    @Autowired
    private adminService adminService;

    @GetMapping("/admin")
    public List<Admin> getAdmin(){
        return adminService.getAdmin();
    }

    @PostMapping("/adminRegister")
    public String registerAdmin(@RequestBody Admin admin){
        adminService.registerAdmin(admin);
        return "admin registered";
    }

    @PostMapping("/adminLogin")
    public String loginAdmin(@RequestBody Map<String , String> adminLogin){
        String username = adminLogin.get("username");
        String password = adminLogin.get("password");

        if(adminService.checkadmin(username , password)){
            return "Admin login";
        }
        else
            return "invalid admin";
    }
}
