package com.RecursosTecnologicos.dummy_data;


import com.RecursosTecnologicos.models.AsignacionResponsableTecnicoRT;

import java.util.ArrayList;
import java.util.Random;

public class GeneradorDummyAsignacionResponsableTecnicoRT {
    static private Random randomNumbers = new Random();
    static public AsignacionResponsableTecnicoRT generarAsignacionResponsableTecnicoRT() {
        AsignacionResponsableTecnicoRT asignacionResponsableTecnicoRT = new AsignacionResponsableTecnicoRT();
        asignacionResponsableTecnicoRT.setPersonalCientifico(GeneradorDummyPersonalCientifico.generarPersonalCientifico());
        asignacionResponsableTecnicoRT.setRecursosTecnologicos(GeneradorDummyRecursosTecnologicos.generarRecursosTecnologicos(randomNumbers.nextInt(10)));
        return asignacionResponsableTecnicoRT;
    }

    static public ArrayList<AsignacionResponsableTecnicoRT> generarAsignacionesResponsableTecnicoRT(int n) {
        ArrayList<AsignacionResponsableTecnicoRT> asignacionesResponsableTecnicoRT = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            asignacionesResponsableTecnicoRT.add(generarAsignacionResponsableTecnicoRT());
        }
        return asignacionesResponsableTecnicoRT;
    }
}
