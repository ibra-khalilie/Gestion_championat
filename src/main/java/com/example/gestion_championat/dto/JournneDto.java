package com.example.gestion_championat.dto;

import com.example.gestion_championat.model.Championnat;
import com.example.gestion_championat.model.Game;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JournneDto {
    private Long id;
    private int numero;
    private List<Game> game;
    private Championnat championnat;
}
