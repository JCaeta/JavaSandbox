package com.JavaSandbox.models;

import java.util.ArrayList;
import lombok.Data;

@Data
public class Prestador {
    private String nombre;
    private ArrayList<DefinicionAgenda> definicionesAgenda;

    public void crearAgenda(DefinicionAgenda definicionAgenda) {
        
    }
}

