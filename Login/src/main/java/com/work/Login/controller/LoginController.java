package com.work.Login.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(@RequestParam("username")String username, @RequestParam("password")String password, Map<String,Object> maps, HttpSession session){
        if("jonna".equals(username) && "123456".equals(password)){
            session.setAttribute("username", username);
            return "redirect:/main";
        }else{
            maps.put("msg", "登录失败，用户名或密码错误");
            return "login";
        }
    }
}