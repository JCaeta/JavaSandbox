package com.JavaSandbox.models;

import java.util.ArrayList;
import lombok.Data;

@Data
public class DefinicionAgenda {
    private int duracionTurno;
    private int intervaloEntreTurnos;
    private ArrayList<DetalleDefinicionAgenda> detallesDefinicionAgenda;
    private int anio;
    private int mes;

    public void conocerDetalleDefinicionAgenda(DetalleDefinicionAgenda detalleDefinicionAgenda)
    {
        this.detallesDefinicionAgenda.add(detalleDefinicionAgenda);
    }
}

