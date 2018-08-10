package com.chavot.controller;

import com.chavot.model.User;
import com.chavot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MessageController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/message")
    @ResponseBody
    public String home2() {
        System.out.println("処理開始");

        User taro = new User("taro", "yamada");
        userRepository.save(taro);

        User jiro = new User("jiro", "yamada");
        userRepository.save(jiro);

        User saburo = new User("saburo", "yamada");
        userRepository.save(saburo);

        User takeshi = new User("takeshi", "suzuki");
        userRepository.save(takeshi);

        List<User> result = userRepository.findByName("taro");
        for(User user : result){
            System.out.println(user.getName() + " " + user.getAddress());
        }

        jiro.setName("tanaka");
        userRepository.save(jiro);

        userRepository.delete(saburo);

        System.out.println("処理終了");

        return "Hello, Spring Boot Sample Application::home";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello, Spring Boot Sample Application::test";
    }
}
