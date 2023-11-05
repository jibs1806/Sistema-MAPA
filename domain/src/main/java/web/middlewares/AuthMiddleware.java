package web.middlewares;

import domain.people.SystemRole;
import io.javalin.config.JavalinConfig;
import io.javalin.http.Context;
import web.exceptions.AccessDeniedException;

public class AuthMiddleware {

    public static void apply(JavalinConfig config) {
        config.accessManager(((handler, context, routeRoles) -> {

            SystemRole userRole = getUserRoleType(context);

            if(routeRoles.size() == 0 || routeRoles.contains(userRole)) {
                handler.handle(context);
            }
            else {
                throw new AccessDeniedException();
            }
        }));
    }

    private static SystemRole getUserRoleType(Context context) {
        return context.sessionAttribute("tipo-rol") != null?
                SystemRole.valueOf(context.sessionAttribute("tipo-rol")) : null;
    }

}