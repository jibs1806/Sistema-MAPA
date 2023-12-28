package org.mapa.MAPA.web.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String showLoginPage(){
        String html = "login";
        return html;
    }

    @GetMapping("/signUp")
    public String showRegisterPage(){
        String html = "signUp";
        return html;
    }
}
