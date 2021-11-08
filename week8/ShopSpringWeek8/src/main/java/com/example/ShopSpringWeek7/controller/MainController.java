package com.example.ShopSpringWeek7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/hello")
    public String hello() {
        return "hey!";
    }

    @GetMapping("/user")
    public String user() {
        return "hey ya!";
    }
    @GetMapping("/admin")
    public String admin() {
        return "hey admin!";
    }
}
