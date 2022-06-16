package com.JavaSandbox.models.dummyData;

import java.util.ArrayList;
import java.util.List;

import com.JavaSandbox.models.Modelo;


public class GeneradorModelo {
    public static List<Modelo> generarModelos() {
        List<Modelo> modelos = new ArrayList<>();
        
        Modelo modelo1 = new Modelo();
        modelo1.setNombre("Modelo 1");

        Modelo modelo2 = new Modelo();
        modelo2.setNombre("Modelo 2");

        Modelo modelo3 = new Modelo();
        modelo3.setNombre("Modelo 3");

        Modelo modelo4 = new Modelo();
        modelo4.setNombre("Modelo 4");

        Modelo modelo5 = new Modelo();
        modelo5.setNombre("Modelo 5");

        Modelo modelo6 = new Modelo();
        modelo6.setNombre("Modelo 6");

        Modelo modelo7 = new Modelo();
        modelo7.setNombre("Modelo 6");

        Modelo modelo8 = new Modelo();
        modelo7.setNombre("Modelo 8");

        Modelo modelo9 = new Modelo();
        modelo9.setNombre("Modelo 9");

        Modelo modelo10 = new Modelo();
        modelo10.setNombre("Modelo 10");

        modelos.add(modelo1);
        modelos.add(modelo2);
        modelos.add(modelo3);
        modelos.add(modelo4);
        modelos.add(modelo5);
        modelos.add(modelo6);
        modelos.add(modelo7);
        modelos.add(modelo8);
        modelos.add(modelo9);
        modelos.add(modelo10);

        return modelos;
    }

    public static Modelo generarModelo(String nombre)
    {
        Modelo modelo = new Modelo();
        modelo.setNombre(nombre);
        return modelo;
    }
}