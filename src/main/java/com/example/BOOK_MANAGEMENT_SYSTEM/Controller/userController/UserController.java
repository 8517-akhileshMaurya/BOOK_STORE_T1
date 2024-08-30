package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.userController;


import com.example.BOOK_MANAGEMENT_SYSTEM.Service.userService.userService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private userService userService;


    @GetMapping("/user")
    public List<Users> getUser() {
        return userService.getUser();
    }

    @PostMapping("/userRegister")
    public String registerUser(@Valid @RequestBody Users users) {
        userService.registerUser(users);
        return "user added";
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Map<String , String> login) {
        String userName = login.get("username");
        String passwoed = login.get("password");
        String token;

        if(userService.checkUser(userName , passwoed)){
            token="user login";
            return ResponseEntity.ok(Collections.singletonMap("token",token));
        }
        else {
//            token="user invalid";
//            return ResponseEntity.ok(Collections.singletonMap("token",token));
              throw new RuntimeException();

        }
    }


//    @PostMapping("/login")
//    public String loginUser(@RequestBody Map<String , String> login) {
//        String userName = login.get("username");
//        String passwoed = login.get("password");
//
//        if(userService.checkUser(userName , passwoed)){
//            return "user login";
//        }
//        else {
//            return "user invalid";
//        }
//    }

//        @PostMapping("/login")
//        public ResponseEntity<?> loginUser(@RequestBody LoginRequestDTO  loginDTO){
//        String token= userService.loginUser(loginDTO);
//        return ResponseEntity.ok(Collections.singletonMap("token",token));
//    }


//    @PostMapping("/login")
//    public ResponseEntity<String> loginUser(@RequestBody LoginRequestDTO loginRequest) {
//        String userName = loginRequest.getUsername();
//        String password = loginRequest.getPassword();
//
//        if (userService.checkUser(userName, password)) {
//            return new ResponseEntity<>("User login successful", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Invalid user credentials", HttpStatus.UNAUTHORIZED);
//        }
//    }
}



