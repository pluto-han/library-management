package com.example.springboot.Service;

import com.example.springboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {
    List<User> ListUsers();
}
