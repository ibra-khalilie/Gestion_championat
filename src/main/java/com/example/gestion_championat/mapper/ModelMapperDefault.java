package com.example.gestion_championat.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperDefault {


    @Bean("entityToDto")
    public ModelMapper entityToDto(){
        return new ModelMapper();
    };

    @Bean("dtoToEntity")
    public ModelMapper dtoToEntity(){
        return new ModelMapper();
    };
}
