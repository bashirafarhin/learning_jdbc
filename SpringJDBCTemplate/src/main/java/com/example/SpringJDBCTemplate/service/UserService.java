package com.example.SpringJDBCTemplate.service;

import com.example.SpringJDBCTemplate.entity.User;
import com.example.SpringJDBCTemplate.repository.UserRepository;
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

    public User getById(Long id) {
        return repository.findById(id);
    }

    public void update(User user) {
        repository.update(user);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
}
