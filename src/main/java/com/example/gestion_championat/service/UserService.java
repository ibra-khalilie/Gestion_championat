package com.example.gestion_championat.service;

import com.example.gestion_championat.model.User;
import com.example.gestion_championat.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAll(){
        return this.userRepository.findAll();
    }

    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

}
