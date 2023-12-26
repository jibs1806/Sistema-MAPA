package org.mapa.MAPA.web.controllers;

import org.mapa.MAPA.domain.people.User;
import org.mapa.MAPA.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return this.userService.findAll();
    }

    @PostMapping
    public void create(@RequestBody User user){
        this.userService.save(user);
    }

    @PutMapping
    public void update(@RequestBody User user){
        this.userService.update(user.getId(), user);
    }


    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id){
        return this.userService.findById(id);
    }

    @DeleteMapping
    public void delete(Long id){
        this.userService.delete(id);
    }
}
