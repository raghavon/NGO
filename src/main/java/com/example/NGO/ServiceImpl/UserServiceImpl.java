package com.example.NGO.ServiceImpl;

import com.example.NGO.Entity.User;
import com.example.NGO.Repo.UserRepo;
import com.example.NGO.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepo userRepo;
    @Override
    public void logIn(String name,String password)
    {
        System.out.println(name+"\t222222\t"+password);
        User user=new User(name,password);
        userRepo.save(user);
    }
}
