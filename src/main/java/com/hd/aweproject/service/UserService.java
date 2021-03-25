package com.hd.aweproject.service;

import com.hd.aweproject.domain.User;

public interface UserService {
    void addUser(User user);
    User searchUserId(String userId);
    boolean existUserId(String userId);
}
