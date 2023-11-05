package web.controllers;

import io.javalin.http.Context;
import web.controllers.base.Controller;

import java.util.HashMap;
import java.util.Map;

public class HomeController extends Controller{

    public HomeController(){

    }

    public void showHome(Context context){
        Map<String, Object> model = new HashMap<>();

        context.render("index.hbs", model);
    }
}
