package com.test.DemoApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ResponseBody
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to home page";

    }
    @RequestMapping("/about")
    public String about(){
        return "the about section";
    }
}
