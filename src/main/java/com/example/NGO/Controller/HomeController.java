package com.example.NGO.Controller;

import com.example.NGO.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

//Login to future
public class HomeController {
    @Autowired
UserServiceImpl userServiceImpl;
    @RequestMapping("/login")
    public String loginUser(String email, String password)
    {
        System.out.println(email+"\t111111\t"+password);
        userServiceImpl.logIn(email,password);
        return "/views/index.jsp";
    }

    @RequestMapping("/register")
    public String registerUser(String name, String password , String contactNo , String email)
    {
        System.out.println(name+"\t111111\t"+password);
        userServiceImpl.register(name,password,contactNo,email);
        return "/views/login.jsp";
    }
}
