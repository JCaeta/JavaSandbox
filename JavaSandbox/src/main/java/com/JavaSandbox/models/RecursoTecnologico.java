package com.JavaSandbox.models;

import java.util.List;
import lombok.Data;

@Data
public class RecursoTecnologico {
    private Modelo modeloDelRT;

    public Marca getMarca(List<Marca> marcas)
    {
        return this.modeloDelRT.getMarca(marcas);
    }



    // public Marca getMarca(List<Marca> marcas)
    // {
    //     for(Marca marca : marcas)
    //     {
    //         if(marca.tieneModelo(modeloDelRT))
    //         {
    //             return marca;
    //         }
    //     }
    //     return null;
    // }
}
