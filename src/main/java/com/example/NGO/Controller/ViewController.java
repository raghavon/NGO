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



    @RequestMapping("/loginPage")
    public String getLoginPage()
    {
        return "login";
    }



    @RequestMapping("/registerPage")
    public String getRegisterationPage()
    {
        return "redirect:/views/register.jsp";
    }

    @RequestMapping("/userDashboard")
    public String getUserdashboard()
    {
        return "userDashboard";
    }

 @RequestMapping("/adminDashboard")
    public String getadmindashboard()
    {
        return "adminDashboard";
    }

 @RequestMapping("/ngoDashboard")
    public String getNgodashboard()
    {
        return "ngoDashboard";
    }

}
