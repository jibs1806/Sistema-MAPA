package web.controllers;

import persistence.FactoryRepository;

public class FactoryController {
    public  static Object controller(String name){
        Object controller = null;
        switch (name){
            case "Login": controller = new LoginController(FactoryRepository.getRepository("User")); break;
            case "Home": controller = new HomeController(); break;
        }
        return controller;
    }
}
