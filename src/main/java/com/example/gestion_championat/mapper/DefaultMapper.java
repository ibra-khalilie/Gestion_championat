package com.example.gestion_championat.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class DefaultMapper {


    @Autowired
    @Qualifier("entityToDto")
    private ModelMapper entityToDtoMapper;

    @Autowired
    @Qualifier("dtoToEntity")
    private ModelMapper dtoToEntityMapper;

    /*
    public <T, Q> T mapEntityToDto(Q entity, Class<T> dtoClass) {
        return entityToDtoMapper.map;
    }

    public <T, Q> Q mapDtoToEntity(T dto, Class<Q> entityClass) {
        return dtoToEntityMapper.map(dto, entityClass);
    }
*/
}
