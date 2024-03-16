package com.example.gestion_championat.service;

import com.example.gestion_championat.model.User;
import com.example.gestion_championat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    public boolean authenticate(String login, String password) {
        User user = userRepository.findByLogin(login);
        return user != null && user.getMdp().equals(password);
    }

}
