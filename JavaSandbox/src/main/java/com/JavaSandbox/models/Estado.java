package com.JavaSandbox.models;
import lombok.Data;

@Data
public class Estado
{
    private String nombre;
    private String ambito;

    public boolean esReservado()
    {
        return (nombre == "Reservado");
    }

    public boolean esConfirmado()
    {
        return (nombre == "Confirmado");
    }
}

