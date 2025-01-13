package com.example.demo.service;

import com.example.demo.entity.Users;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<Users> findAll() {
        return userMapper.findAll();
    }

    public Users findById(Long id) {
        return userMapper.findById(id);
    }

    public void save(Users user) {
        if (user.getId() == null) {
            userMapper.insert(user);
        } else {
            userMapper.update(user);
        }
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }
}