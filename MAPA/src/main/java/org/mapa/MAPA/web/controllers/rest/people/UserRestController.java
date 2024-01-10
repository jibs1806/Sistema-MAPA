package org.mapa.MAPA.web.controllers.rest.people;



import org.mapa.MAPA.domain.agents.users.User;
import org.mapa.MAPA.services.BaseService;
import org.mapa.MAPA.services.people.UserService;
import org.mapa.MAPA.web.controllers.rest.BaseRestController;
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
