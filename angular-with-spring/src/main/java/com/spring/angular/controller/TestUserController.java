package com.spring.angular.controller;

import com.spring.angular.entity.TestUser;
import com.spring.angular.service.TestUserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class TestUserController {

    private TestUserService service;

    @PostMapping("/create")
    public TestUser createData(@RequestBody TestUser user) {
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        return user;
    }

    @GetMapping("/get")
    public List<TestUser> getData() {
        List<TestUser> list = new ArrayList<>();
        list.add(new TestUser("name","subham@gmail.com","subham"));
        list.add(new TestUser("name","subham@gmail.com","subham"));
        list.add(new TestUser("name","subham@gmail.com","subham"));
        list.add(new TestUser("name","subham@gmail.com","subham"));
        return list;
    }

    @GetMapping("/getValue")
    public

}





