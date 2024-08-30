package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.userController;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.userService.userService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private userService userService;


    @GetMapping("/user")
    public List<Users> getUser(){
        return userService.getUser();
    }

    @PostMapping("/userRegister")
    public String registerUser(@Valid @RequestBody Users users) {
        userService.registerUser(users);
        return "user added";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Map<String , String> login) {
        String userName = login.get("username");
        String passwoed = login.get("password");

        if(userService.checkUser(userName , passwoed)){
            return "user login";
        }
        else {
            return "user invalid";
        }
    }
}


