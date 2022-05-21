package com.JavaSandbox.models;
import lombok.Data;

@Data
public class PersonalCientifico {
    private String nombre;
    private String apellido;

    public String[] mostrarPersonalCientifico()
    {
        String[] datosPersonalCientifico = new String[2];

        datosPersonalCientifico[0] = nombre;
        datosPersonalCientifico[1] = apellido;
        
        return datosPersonalCientifico;
    }
}



