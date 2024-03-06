package com.example.gestion_championat.mapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class ModelMapper {


    @Bean("entityToDto")
    public ModelMapper entityToDto(){
        return new ModelMapper();
    };

    @Bean("dtoToEntity")
    public ModelMapper dtoToEntity(){
        return new ModelMapper();
    };
}
