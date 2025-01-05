package com.example.NGO.Service;

import com.example.NGO.Entity.User;

public interface UserService {
    User logIn(String name, String password);
    void register(String name, String password , String contactNo , String email);
}
