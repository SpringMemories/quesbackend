package com.hd.aweproject.service.impl;

import com.hd.aweproject.domain.User;
import com.hd.aweproject.repository.UserRepository;
import com.hd.aweproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
    @Override
    public User searchUserId(String userId) {
        return userRepository.findByUserId(userId);
    }
    @Override
    public boolean existUserId(String userId) {return userRepository.existsByUserId(userId);}
}
