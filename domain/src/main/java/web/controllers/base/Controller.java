package web.controllers.base;

import domain.people.User;
import io.javalin.http.Context;
import persistence.FactoryRepository;
import persistence.Repository;

import java.util.Map;

public abstract class Controller {
    public static boolean yaEstaLogeado(Context ctx){

        return ctx.sessionAttribute("current-user") != null;
    }

    public static void modificarModelSiEstaLogueado(Context ctx, Map<String, Object> model){
        // Este método solo hace falta usarlo en páginas que se puedan ver tanto si estás logueado como si no
        if (yaEstaLogeado(ctx)) {
            modificarModelLogueado(ctx, model);
        }
    }

    public static void modificarModelLogueado(Context ctx, Map<String, Object> model){
        model.put("logueado", true);
        model.put("username", getCurrentUserName(ctx));
        model.put(getUser(ctx).getSystemRole().name(), true);
    }

    public static String getCurrentUserName(Context ctx){
        return ctx.sessionAttribute("current-user");
    }

    public static User getUser(Context ctx){
        Repository<User> userRepository = (Repository<User>) FactoryRepository.getRepository("User");
        return userRepository.getAll().stream().filter(u -> u.getUserName().equals(getCurrentUserName(ctx))).findFirst().get();

    }

}