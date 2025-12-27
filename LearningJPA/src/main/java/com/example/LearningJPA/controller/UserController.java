package com.example.LearningJPA.controller;

import com.example.LearningJPA.entity.User;
import com.example.LearningJPA.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody User user) {
        service.create(user);
//        return service.findById(1L);
    }

    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

}
