package com.ashahar.JotDown.Controller;

import com.ashahar.JotDown.Model.User;
import com.ashahar.JotDown.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return service.saveUser(user);
    }

    @PostMapping("/oauth/register")
    public User oauthRegister(@RequestBody User user){
        return null;
    }
}
