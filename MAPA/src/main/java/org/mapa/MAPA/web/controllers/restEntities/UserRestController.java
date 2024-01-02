package org.mapa.MAPA.web.controllers.restEntities;



import org.mapa.MAPA.domain.people.user.User;
import org.mapa.MAPA.services.BaseService;
import org.mapa.MAPA.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserRestController extends BaseRestController<User> {

    @Autowired
    private UserService userService;

    @Override
    protected BaseService getService() {
        return this.userService;
    }
}
