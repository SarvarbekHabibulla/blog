package com.imho.blog.services;

import com.imho.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
