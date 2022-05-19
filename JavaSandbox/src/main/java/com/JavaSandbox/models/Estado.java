package com.JavaSandbox.models;
import lombok.Data;

@Data
public class Estado
{
    private String nombre;
    private String ambito;

    public boolean esDisponible()
    {
        return (nombre == "Disponible");
    }
}

