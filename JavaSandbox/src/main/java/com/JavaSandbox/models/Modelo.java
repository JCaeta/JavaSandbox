package com.JavaSandbox.models;
import java.util.List;
import lombok.Data;

@Data
public class Modelo {
    private String nombre;

    public Marca getMarca(List<Marca> marcas)
    {
        for(Marca marca: marcas)
        {
            if(marca.tieneModelo(this))
            {
                return marca;
            }
        }
        return null;
    }

    public boolean sosModelo(Modelo modelo)
    {
        return modelo.getNombre() == this.getNombre();
    }


    // public Boolean esDeMarca(Marca marca){
    //     return marca.tieneModelo(this);
    // }
}


