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
    public String getHome( String name, String password)
    {
        System.out.println(name+"\t111111\t"+password);
        userServiceImpl.logIn(name,password);
        return "/views/index.jsp";
    }
}
