package com.example.gestion_championat.service;

import com.example.gestion_championat.repository.PaysRepository;
import org.springframework.stereotype.Service;

@Service
public class PaysService {

    private PaysRepository paysRepository;

    public PaysService (PaysRepository paysRepository){
        this.paysRepository = paysRepository;
    }
}
