package com.example.NGO.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login_Info")
public class User {

    public User() {
    }

    @Id
String name;
    @Column
String password;

    public User(String name,String password) {
        this.name=name;
        this.password=password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}
