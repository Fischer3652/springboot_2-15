package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTest {

    @RequestMapping(value = "/queryUser", method = RequestMethod.GET)
    public String queryUser(){
        return "ok";
    }
}
