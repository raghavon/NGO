package com.example.NGO.Repo;

import com.example.NGO.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String>
{
}
