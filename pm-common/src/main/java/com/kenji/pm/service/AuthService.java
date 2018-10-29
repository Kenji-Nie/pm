package com.kenji.pm.service;

import com.kenji.pm.entity.User;

public interface AuthService {
    User register(User user);
    String login(User user);
    String refresh(String oldToken);
}
