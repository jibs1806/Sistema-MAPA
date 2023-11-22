package web.controllers;

import domain.people.User;
import io.javalin.http.Context;
import persistence.Repository;
import web.controllers.base.Controller;

import java.util.HashMap;
import java.util.Map;

public class LoginController extends Controller {

    private Repository<User> repoDeUsuarios;

    public LoginController(Repository<User> repoDeUsuarios){
        this.repoDeUsuarios = repoDeUsuarios;
    }

    public void home(Context context){
        Map<String, Object> model = new HashMap<>();

        modificarModelSiEstaLogueado(context, model);

        context.render("login.hbs", model);
    }

    public void mostrarPantallaLogin(Context context){
        Map<String, Object> model = new HashMap<>();

        modificarModelSiEstaLogueado(context, model);

        if (yaEstaLogeado(context)) context.redirect("home");
        else context.render("login.hbs", model);

    }

    public void login(Context context){

        if (this.sonCredencialesValidas(context)){
            context.sessionAttribute("current-user", context.formParam("username"));

            context.sessionAttribute("tipo-rol", super.getUser(context).getSystemRole().name());

            context.redirect("home");
        }
        else{
            Map<String, Object> model = new HashMap<>();

            model.put("mensaje","ERROR: Las credenciales ingresadas son incorrectas");
            context.render("mensaje.hbs", model);
        }
    }

    public void logout(Context context){
        context.req().getSession().invalidate();
        context.redirect("home");
    }

    public boolean sonCredencialesValidas(Context context){
        return this.repoDeUsuarios.getAll().stream().anyMatch(user -> user.getUserName().equals(context.formParam("username")) && user.getPassword().equals(context.formParam("password")));
    }
}