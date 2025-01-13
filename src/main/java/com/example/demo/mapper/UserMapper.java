package com.example.demo.mapper;

import com.example.demo.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<Users> findAll();
    Users findById(Long id);
    void insert(Users user);
    void update(Users user);
    void delete(Long id);
} 