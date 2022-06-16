package com.JavaSandbox.models.dummyData;
import java.util.ArrayList;
import java.util.List;

import com.JavaSandbox.models.Modelo;
import com.JavaSandbox.models.RecursoTecnologico;


public class GeneradorRecursoTecnologico {
    static public List<RecursoTecnologico> generarRecursosTecnologicos()
    {
        // Crear una lista de modelos para todos los recursos tecnologicos
        List<Modelo> modelos = GeneradorModelo.generarModelos();
    
        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 1
        RecursoTecnologico recursoTecnologico1 = new RecursoTecnologico();
        recursoTecnologico1.setModeloDelRT(modelos.get(0));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 2
        RecursoTecnologico recursoTecnologico2 = new RecursoTecnologico();
        recursoTecnologico2.setModeloDelRT(modelos.get(1));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 3
        RecursoTecnologico recursoTecnologico3 = new RecursoTecnologico();
        recursoTecnologico3.setModeloDelRT(modelos.get(2));
        
        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 4
        RecursoTecnologico recursoTecnologico4 = new RecursoTecnologico();
        recursoTecnologico4.setModeloDelRT(modelos.get(3));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 5
        RecursoTecnologico recursoTecnologico5 = new RecursoTecnologico();
        recursoTecnologico5.setModeloDelRT(modelos.get(4));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 6
        RecursoTecnologico recursoTecnologico6 = new RecursoTecnologico();
        recursoTecnologico6.setModeloDelRT(modelos.get(5));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 7
        RecursoTecnologico recursoTecnologico7 = new RecursoTecnologico();
        recursoTecnologico7.setModeloDelRT(modelos.get(6));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 8
        RecursoTecnologico recursoTecnologico8 = new RecursoTecnologico();
        recursoTecnologico8.setModeloDelRT(modelos.get(7));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 9
        RecursoTecnologico recursoTecnologico9 = new RecursoTecnologico();
        recursoTecnologico9.setModeloDelRT(modelos.get(8));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 10
        RecursoTecnologico recursoTecnologico10 = new RecursoTecnologico();
        recursoTecnologico10.setModeloDelRT(modelos.get(9));

        // ------------------------------------------------------------------------------------------------------------------
        ArrayList<RecursoTecnologico> recursosTecnologicos = new ArrayList<>();
        recursosTecnologicos.add(recursoTecnologico1);
        recursosTecnologicos.add(recursoTecnologico2);
        recursosTecnologicos.add(recursoTecnologico3);
        recursosTecnologicos.add(recursoTecnologico4);
        recursosTecnologicos.add(recursoTecnologico5);
        recursosTecnologicos.add(recursoTecnologico6);
        recursosTecnologicos.add(recursoTecnologico7);
        recursosTecnologicos.add(recursoTecnologico8);
        recursosTecnologicos.add(recursoTecnologico9);
        recursosTecnologicos.add(recursoTecnologico10);

        return recursosTecnologicos;
    }
}