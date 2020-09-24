package com.example.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/hellosucc")
    public String helloSucc(Map<String,Object> maps) {
        maps.put("msg", "thymeleaf使用方法");
        return "base";
    }
}