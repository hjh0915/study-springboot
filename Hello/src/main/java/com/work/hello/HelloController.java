package com.work.hello;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
public class HelloController {
    // @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "This is my first springboot";
    }
}