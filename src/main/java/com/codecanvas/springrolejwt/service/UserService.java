package com.codecanvas.springrolejwt.service;

import com.codecanvas.springrolejwt.model.User;
import com.codecanvas.springrolejwt.model.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    Optional<User> findOne(long id);
}
