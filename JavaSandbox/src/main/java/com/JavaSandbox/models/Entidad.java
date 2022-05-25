package com.JavaSandbox.models;
import lombok.Data;

@Data
public class Entidad {
    private int numeroEntidad = 2;
    private String descripcion = "Esta es una descripción";

    public String[] getDatos()
    {
        String datos[] = new String[2];
        datos[0] = Integer.toString(numeroEntidad);
        datos[1] = descripcion;
        return datos;
    }
}

