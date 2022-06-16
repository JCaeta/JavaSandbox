package com.JavaSandbox.models;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Turno {
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private String diaSemana;
}


