package com.example.NGO.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ViewController {

    @RequestMapping("/")
    public String indexPage()
    {
        return "redirect:/views/index.jsp";
    }



    @RequestMapping("/login")
    public String getLoginPage()
    {
        return "redirect:/views/login.jsp";
    }



    @RequestMapping("/register")
    public String getRegisterationPage()
    {
        return "redirect:/views/register.jsp";
    }

    @RequestMapping("/userDashboard")
    public String getUserdashboard()
    {
        return "redirect:/views/userDashboard.jsp";
    }

}
