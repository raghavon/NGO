package com.example.NGO.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("/home")

public class HomeController {
    @RequestMapping("/api")
    public String getHome( String name, String contactNo)
    {
        return "/views/index.jsp";
    }
}
