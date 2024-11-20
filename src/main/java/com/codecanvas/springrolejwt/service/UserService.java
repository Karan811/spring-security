package com.codecanvas.springrolejwt.service;

import com.codecanvas.springrolejwt.model.User;
import com.codecanvas.springrolejwt.model.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
