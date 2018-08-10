package com.chavot.controller;

import com.chavot.model.User;
import com.chavot.model.UserAsk;
import com.chavot.model.botreply.define.ButtonConfig;
import com.chavot.model.botreply.define.ButtonPayload;
import com.chavot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Payload;
import java.util.List;

@Controller
public class ScenarioController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    @ResponseBody
    public String home() {


        ButtonConfig backMenu = ButtonConfig.BACK_MENU;
        ButtonConfig purchase = ButtonConfig.PURCHASE;

        ButtonPayload backPayload = backMenu.getPayload();
        boolean jsonformat = backMenu.hasJsonPayload();

        ButtonPayload purchasePayload = purchase.getPayload();
        boolean jsonFormat = purchase.hasJsonPayload();
        List<String> payloads = purchasePayload.getJsonKeyNames();

        String test = "";

        return "Hello, Spring Boot Sample Application::home";
    }
}
