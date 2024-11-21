package com.example.NGO.ServiceImpl;

import com.example.NGO.Entity.User;
import com.example.NGO.Repo.UserRepo;
import com.example.NGO.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepo userRepo;

    @Override
    public boolean logIn(String email, String password) {
        User user=userRepo.findByEmailAndPassword(email,password);
        return user!=null;
    }

    @Override
    public void register(String name, String password, String contactNo, String email)
    {
        System.out.println(name+"\t222222\t"+password);
        User user=new User(name,password,email,contactNo);
        userRepo.save(user);
    }
}
