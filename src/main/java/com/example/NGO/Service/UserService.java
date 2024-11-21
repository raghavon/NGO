package com.example.NGO.Service;

public interface UserService {
    boolean logIn(String name,String password);
    void register(String name, String password , String contactNo , String email);
}
