package com.example.gestion_championat.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IService<T, ID> {
    List<T> getAll();
    T getById(ID id);
    T save(T entity);
    void deleteById(ID id);
}
