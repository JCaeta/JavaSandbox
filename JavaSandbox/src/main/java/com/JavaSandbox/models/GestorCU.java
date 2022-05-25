package com.JavaSandbox.models;
import java.util.ArrayList;
import com.JavaSandbox.Pantalla;

public class GestorCU {
    ArrayList<Entidad> entidades = new ArrayList<Entidad>();

    public GestorCU(){}

    public void iniciarCU(Pantalla pantalla){
        ArrayList<String[]> datos = buscarCosas();
        pantalla.mostrarDatos(datos);
    }

    public ArrayList<String[]> buscarCosas()
    {
        ArrayList<String[]> datos = new ArrayList<String[]>();
        for(Entidad entidad : entidades)
        {
            datos.add(entidad.getDatos());
        }
        return datos;
    }
}



