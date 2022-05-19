package com.JavaSandbox.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class RecursoTecnologico {
    private int numeroRT;
    private ArrayList<CambioEstadoRT> cambiosEstados = new ArrayList<>();

    public String getDatos() {
        return "Recurso tecnológico número " + numeroRT;
    }

    public boolean estaDisponible()
    {
        for(CambioEstadoRT cambioEstadoRT : cambiosEstados) {
            if(cambioEstadoRT.esActual()) {
                return cambioEstadoRT.esDisponible();
            }
        }
        return false;
    }
}

