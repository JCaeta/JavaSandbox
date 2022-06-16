package com.JavaSandbox.models;
import java.time.LocalTime;
import lombok.Data;

@Data
public class DetalleDefinicionAgenda{
    private String diaSemana;
    private boolean esIntervaloEntreHoras;
    private LocalTime horaInicio;
    private LocalTime horaFin;
}


