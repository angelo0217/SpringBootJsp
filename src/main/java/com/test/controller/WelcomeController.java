package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String,Object> map){

        map.put("hello", "Hi");

        return "helloJsp";

    }
}