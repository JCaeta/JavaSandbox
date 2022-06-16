package com.JavaSandbox.models.dummyData;

import java.util.ArrayList;
import java.util.List;

import com.JavaSandbox.models.Marca;
import com.JavaSandbox.models.Modelo;


public class GeneradorMarca {
    public static List<Marca> generarMarcas()
    {
        List<Marca> marcas = new ArrayList<Marca>();
        List<Modelo> modelos = GeneradorModelo.generarModelos();

        Marca marca1 = new Marca();
        marca1.setNombre("Marca 1");
        marca1.setModelos(modelos.subList(0, 3));

        Marca marca2 = new Marca();
        marca2.setNombre("Marca 2");
        marca2.setModelos(modelos.subList(3, 6));

        Marca marca3 = new Marca();
        marca3.setNombre("Marca 3");
        marca3.setModelos(modelos.subList(6, 9));

        marcas.add(marca1);
        marcas.add(marca2);
        marcas.add(marca3);

        return marcas;
    }
}