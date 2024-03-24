package com.example.gestion_championat.model;

import com.example.gestion_championat.dto.JournneDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class JourneeAvecMatchsParDate {
    @Getter
    @Setter
    private JournneDto journee;

    @Getter
    @Setter
    private Map<LocalDate, List<Game>> matchsParDate;

}
