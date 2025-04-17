package com.example.demo.dao;


import com.example.demo.model.User;

import java.util.List;

public interface UserDao {

   void add(User user);

   List<User> listUsers();

   User findById(Long id);

   void delete(Long id);

}
