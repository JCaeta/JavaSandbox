package com.JavaSandbox.models;

import lombok.Data;

@Data
public class RecursoTecnologico {
    private int numeroRT;

    public String getDatos() {
        return "Recurso tecnológico número " + numeroRT;
    }

}
