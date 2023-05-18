package com.hzc.boot.controller;

import com.hzc.boot.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
public class UserController {


    @PostMapping("/b")
    public User saveUser(@RequestBody User user) {
        return new User();

    }

    @GetMapping("/a")
    public String getUserWithDepartment(@PathVariable("id") Long userId) {
        return userId.toString();

    }

}