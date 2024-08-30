package com.example.BOOK_MANAGEMENT_SYSTEM.Service.userService;


import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.userRepo.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    @Autowired
    private userRepository userRepository;

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

    public Boolean checkUser(String username, String password){
        int countt = (int) userRepository.findAll().stream().filter((a)->{
            return a.getUsername().equals(username) && a.getPassword().equals(password);
        }).count();

        if(countt!=0){
            return true;
        }
        return false;
    }


}




