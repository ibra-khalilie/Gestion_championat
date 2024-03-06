package com.example.gestion_championat.dto;

import com.example.gestion_championat.model.Championnat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaysDto {
    private Long id;
    private String nom;
    private String logo;
    private List<Championnat> championnatList;
}
