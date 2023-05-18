package com.hzc.boot.controller;

import com.hzc.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanzhichao7
 * @date 2023/4/4 10:30
 */
@RestController
public class ApplicationController {

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/hello1")
    public String hello1(){
        return "hello world1";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "hello world2";
    }

    @RequestMapping("/profile")
    public String testProfile(){
        return person.getName();
    }

}
