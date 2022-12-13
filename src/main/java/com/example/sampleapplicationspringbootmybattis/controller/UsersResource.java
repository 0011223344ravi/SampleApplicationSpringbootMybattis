package com.example.sampleapplicationspringbootmybattis.controller;

import com.example.sampleapplicationspringbootmybattis.mapper.UsersMapper;
import com.example.sampleapplicationspringbootmybattis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersResource {
    @Autowired
    private UsersMapper usersMapper;

    public UsersResource(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }


    @GetMapping("/allUsers")
    public List<User> getAll() {
        return usersMapper.findAll();
    }

    @GetMapping("/update")
    private List<User> update() {

        User users = new User();
        users.setName("Youtube1");
        users.setSalary(2333L);

        usersMapper.insert(users);

        return usersMapper.findAll();
    }
}