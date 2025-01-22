package com.example.springboot.Service.impl;

import com.example.springboot.Service.IUserService;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> ListUsers() {
        return userMapper.ListUsers();
    }
}
