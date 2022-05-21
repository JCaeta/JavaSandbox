package com.JavaSandbox.models;

import lombok.Data;
import java.time.LocalDate;
import java.util.ArrayList;

@Data
public class RecursoTecnologico {
    private ArrayList<Turno> turnos;

    public ArrayList<Turno> getTurnosEnPlazo(LocalDate fecha) {
        ArrayList<Turno> turnosEnPlazo = new ArrayList<>();
        for(Turno turno: turnos)
        {
            if(turno.estaEnPlazo(fecha))
            {
                turnosEnPlazo.add(turno);
            }
        }
        return turnosEnPlazo;
    }
}

