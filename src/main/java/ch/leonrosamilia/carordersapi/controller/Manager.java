package ch.leonrosamilia.carordersapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Manager {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "loginPage";
    }

    @PostMapping("/login")
    public String postLogin() {
        return "redirect: /";
    }

    @GetMapping("/signup")
    public String getSignUp(){}
}
