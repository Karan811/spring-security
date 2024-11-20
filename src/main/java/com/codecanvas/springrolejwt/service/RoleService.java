package com.codecanvas.springrolejwt.service;

import com.codecanvas.springrolejwt.model.Role;

public interface RoleService {
    Role findByName(String name);
}
