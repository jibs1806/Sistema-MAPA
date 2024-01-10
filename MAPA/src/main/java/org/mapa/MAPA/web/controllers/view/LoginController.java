package org.mapa.MAPA.web.controllers.view;


import jakarta.servlet.http.HttpServletRequest;
import org.mapa.MAPA.domain.agents.users.User;
import org.mapa.MAPA.services.people.UserService;
import org.mapa.MAPA.services.exception.user.IncorrectPasswordException;
import org.mapa.MAPA.services.exception.user.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public RedirectView verifyUserCredentials(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Optional<User> user = this.userService.findByUsername(username);

        if(user.isEmpty())
            throw new UserNotFoundException("User not found with username: " + username);

        if(!this.userService.isPasswordCorrect(user.get(), password))
            throw new IncorrectPasswordException();


        String url = "menu";
        return new RedirectView(url, true);
    }

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleUserNotFoundException(UserNotFoundException ex, Model model) {
        model.addAttribute("message", ex.getMessage());
        return "message";
    }

    @ExceptionHandler(IncorrectPasswordException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleIncorrectPasswordException(IncorrectPasswordException ex, Model model) {
        model.addAttribute("message", ex.getMessage());
        return "message";
    }
}
