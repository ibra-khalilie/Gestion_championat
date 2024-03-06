package com.example.gestion_championat.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DefaultMapper {


    @Autowired
    @Qualifier("entityToDto")
    private ModelMapper entityToDto;

    @Autowired
    @Qualifier("dtoToEntity")
    private ModelMapper dtoToEntity;


    public <T, Q> T mapEntityToDto(Q entity, Class<T> dtoClass) {
        return entityToDto.map(entity, dtoClass);
    }

    public <T, Q> Q mapDtoToEntity(T dto, Class<Q> entityClass) {
        return dtoToEntity.map(dto, entityClass);
    }

}
