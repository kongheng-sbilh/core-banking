package com.kh.cardservice.controller;

import com.kh.serviceutil.constant.AppUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String welcomeMessage() {
        return "Username = " + AppUser.userName + "\nPassword = " + AppUser.password;
    }
}
