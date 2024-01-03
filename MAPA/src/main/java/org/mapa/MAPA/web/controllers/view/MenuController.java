package org.mapa.MAPA.web.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/cirugias")
    public String showSurgeriesMenu(){
        String html = "surgery/surgeryMenu";
        return html;
    }

    @GetMapping("/practicas")
    public String showPracticesMenu(){
        String html = "menu/practiceMenu";
        return html;
    }

    @GetMapping("/doctor")
    public String showPersonMenu(){
        String html = "person/personMenu";
        return html;
    }

    @GetMapping("/centros")
    public String showCentresMenu(){
        String html = "centre/centreMenu";
        return html;
    }
}
