package web.server;

import web.controllers.FactoryController;
import web.controllers.HomeController;
import web.controllers.LoginController;

import static io.javalin.apibuilder.ApiBuilder.*;
public class Router {
    public static void init() {

        Server.app().routes(() -> {

            get("", ctx -> ctx.redirect("home"));

            get("home", ((HomeController) FactoryController.controller("Home"))::showHome);

            get("login", ((LoginController) FactoryController.controller("Login"))::login);

        });
    };

}