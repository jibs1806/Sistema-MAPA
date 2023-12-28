package org.mapa.MAPA.web.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String goHome(HttpSession session){
        String html = "mainPage/home";

        return html;
    }

    @GetMapping("/")
    public RedirectView redirectToHome(){
        return new RedirectView("/home", true);
    }

    @GetMapping("/base")
    public String base(){
        String html = "base";

        return html;
    }
    @GetMapping("/features")
    public String showFeatures(){
        String html = "mainPage/features";

        return html;
    }




}
