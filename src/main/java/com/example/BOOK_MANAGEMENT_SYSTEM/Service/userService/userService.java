package com.example.BOOK_MANAGEMENT_SYSTEM.Service.userService;


import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.userRepo.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService implements uInterface {

    @Autowired
    private userRepository userRepository;

    @Override
    public boolean checkUser(String username, String password) {
        Users user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }


//    @Autowired
//    private userRepository userRepository;
//
    public List<Users> getUser(){
        return userRepository.findAll();
    }

    public void registerUser(Users users) {
         userRepository.save(users);
    }

    public String loginUser(String username, String password) {
        Users user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return "user present";
        }
        else{
            return "invalid user";
        }
    }




}




