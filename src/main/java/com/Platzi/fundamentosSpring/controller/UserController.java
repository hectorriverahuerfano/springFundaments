package com.Platzi.fundamentosSpring.controller;

import com.Platzi.fundamentosSpring.repository.UserRepository;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
 /*   @GetMapping("/users")
    List<User> list(){
        return userRepositor("%T%");
    } */

}
