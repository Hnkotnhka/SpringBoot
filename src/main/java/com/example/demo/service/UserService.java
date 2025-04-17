package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> listUsers();

    User getUserById(Long id);

    void deleteUser(Long id);

}
