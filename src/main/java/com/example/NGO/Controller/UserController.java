package com.example.NGO.Controller;

import com.example.NGO.Entity.User;
import com.example.NGO.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/user")
@Controller

//Login to future
public class UserController {
    @Autowired
UserServiceImpl userServiceImpl;
    @RequestMapping("/login")
    public ModelAndView loginUser(String email, String password)
    {
        User user=userServiceImpl.logIn(email,password);
        ModelAndView modelAndView= new ModelAndView();
        if(user.getRole().equals("Ngo"))modelAndView.setViewName("redirect:../ngoDashboard");
        else if(user.getRole().equals("User")) modelAndView.setViewName("redirect:../userDashboard");
        else if(user.getRole().equals("Admin")) modelAndView.setViewName("redirect:../adminDashboard");
        else
        {
            modelAndView.addObject("error","Incorrect email or password");
            modelAndView.setViewName("/login");
        }

            return modelAndView;
    }

    @RequestMapping("/register")
    public String registerUser(String name, String password , String contactNo , String email)
    {
        userServiceImpl.register(name,password,contactNo,email);
        return "redirect:/views/login.jsp";
    }
}
