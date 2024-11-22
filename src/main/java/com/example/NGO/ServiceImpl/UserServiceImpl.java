package com.example.NGO.ServiceImpl;

import com.example.NGO.Entity.User;
import com.example.NGO.Repo.UserRepo;
import com.example.NGO.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
import java.util.Base64;

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepo userRepo;

    @Override
    public boolean logIn(String email, String password) {
        byte[] decodePassword=Base64.getDecoder().decode(password);
        User user=userRepo.findByEmailAndPassword(email, Arrays.toString(decodePassword));
       // User user=userRepo.findByEmailAndPassword(email, password);
        return user!=null;
    }

    @Override
    public void register(String name, String password, String contactNo, String email)
    {
        System.out.println(name+"\t222222\t"+password);
        String encodePassword = Base64.getEncoder().encodeToString(password.getBytes());
        User user=new User(name,encodePassword,email,contactNo);
        //User user=new User(name,password,email,contactNo);
        userRepo.save(user);
    }



}
