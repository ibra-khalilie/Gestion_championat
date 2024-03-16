package com.example.gestion_championat.service;

import com.example.gestion_championat.model.Journee;
import com.example.gestion_championat.repository.JourneeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JourneeService {

    private final JourneeRepository journeeRepository;

    public JourneeService(JourneeRepository journeeRepository) {
        this.journeeRepository = journeeRepository;
    }

    public List<Journee> getAllJournees() {
        return journeeRepository.findAll();
    }

}
