package org.mapa.MAPA.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/cirugias")
    public String showSurgeriesMenu(){
        String html = "menu/surgeryMenu";
        return html;
    }

    @GetMapping("/practicas")
    public String showPracticesMenu(){
        String html = "menu/practiceMenu";
        return html;
    }

    @GetMapping("/medicos")
    public String showPersonMenu(){
        String html = "menu/personMenu";
        return html;
    }

    @GetMapping("/centros")
    public String showCentresMenu(){
        String html = "menu/centreMenu";
        return html;
    }
}
