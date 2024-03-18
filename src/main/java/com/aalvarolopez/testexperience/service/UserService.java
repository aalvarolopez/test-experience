package com.aalvarolopez.testexperience.service;

import java.util.List;

import com.aalvarolopez.testexperience.model.User;

public interface UserService {
    List<User> getAllUsers();
    User createUser(User user);
}