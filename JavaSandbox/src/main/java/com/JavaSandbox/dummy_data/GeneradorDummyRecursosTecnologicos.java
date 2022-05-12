package com.RecursosTecnologicos.dummy_data;
import com.RecursosTecnologicos.models.RecursoTecnologico;
import java.util.ArrayList;
import java.util.Random;

public class GeneradorDummyRecursosTecnologicos {
    static private Random randomNumbers = new Random();

    static public RecursoTecnologico generarRecursoTecnologico(){
        RecursoTecnologico recursoTecnologico = new RecursoTecnologico();
        recursoTecnologico.setNumeroRT(randomNumbers.nextInt(100));
        return recursoTecnologico;
    }

    static public ArrayList<RecursoTecnologico> generarRecursosTecnologicos(int n){
        //n: numbers of RecursoTecnologico objects to be generated
        ArrayList<RecursoTecnologico> recursosTecnologicos = new ArrayList<>();
        for(int i = 0; i < n; i++){
            recursosTecnologicos.add(generarRecursoTecnologico());
        }
        return recursosTecnologicos;
    }
}
