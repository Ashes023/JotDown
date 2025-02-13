package com.ashahar.JotDown.Controller;

import com.ashahar.JotDown.Model.User;
import com.ashahar.JotDown.Model.UserPrincipal;
import com.ashahar.JotDown.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
