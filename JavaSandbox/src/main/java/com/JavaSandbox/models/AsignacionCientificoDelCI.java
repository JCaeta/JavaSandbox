package com.JavaSandbox.models;

import java.util.ArrayList;

import lombok.Data;

@Data
public class AsignacionCientificoDelCI {
    ArrayList<Turno> turnos;
    PersonalCientifico personalCientifico;

    public String[] mostrarCientificoDelCI()
    {
        return personalCientifico.mostrarPersonalCientifico();
    }
}
