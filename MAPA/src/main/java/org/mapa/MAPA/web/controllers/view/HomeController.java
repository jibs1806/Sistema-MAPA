package org.mapa.MAPA.web.controllers.view;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showMainPage(HttpSession session){
        String html = "mainPage/home";

        return html;
    }

    @GetMapping("/menu")
    public String showHome(){
        String html = "mainPage/mainMenu";
        return html;
    }
}
