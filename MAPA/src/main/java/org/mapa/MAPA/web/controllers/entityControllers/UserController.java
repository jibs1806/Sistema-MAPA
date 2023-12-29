package org.mapa.MAPA.web.controllers.entityControllers;

import org.mapa.MAPA.domain.people.user.User;
import org.mapa.MAPA.services.BaseService;
import org.mapa.MAPA.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User> {

    @Autowired
    private UserService userService;

    @Override
    protected BaseService<User> getService() {
        return this.userService;
    }

}
