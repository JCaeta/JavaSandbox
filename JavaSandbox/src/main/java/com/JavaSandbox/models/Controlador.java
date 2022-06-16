package com.JavaSandbox.models;

import java.util.List;
import com.JavaSandbox.models.dummyData.GeneradorMarca;
import com.JavaSandbox.models.dummyData.GeneradorRecursoTecnologico;

public class Controlador {
    private List<RecursoTecnologico> recursosTecnologicos = GeneradorRecursoTecnologico.generarRecursosTecnologicos();
    private List<Marca> marcas = GeneradorMarca.generarMarcas();

    public void getDatosRecursosTecnologicos()
    {
        for(RecursoTecnologico recursoTecnologico : recursosTecnologicos)
        {
            Marca marca = recursoTecnologico.getMarca(marcas);
            System.out.println("Marca: " + marca.getNombre());
        }
    }
}

