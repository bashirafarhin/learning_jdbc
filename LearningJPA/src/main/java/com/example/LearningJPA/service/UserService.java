package com.example.LearningJPA.service;

import com.example.LearningJPA.entity.User;
import com.example.LearningJPA.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void create(User user) {
        repository.save(user);
    }

    public List<User> getAll() {
        return repository.findAll();
    }
//    public findById(Long id);

}
