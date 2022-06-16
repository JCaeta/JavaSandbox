package com.JavaSandbox.models;
import java.util.List;
import lombok.Data;

@Data
public class Marca {
    private String nombre;
    private List<Modelo> modelos;
    
    public boolean tieneModelo(Modelo modelo)
    {
        for(Modelo modeloDeMarca : modelos)
        {
            if(modelo.sosModelo(modeloDeMarca))
            {
                return true;
            }
        }
        return false;
    }

    // public boolean sosMarca(Marca marca){
    //     return this.nombre == marca.getNombre();
    // }
}


