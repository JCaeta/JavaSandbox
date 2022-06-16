package com.JavaSandbox.models;
import lombok.Data;

@Data
public class GestorGenerarAgenda {
    private DefinicionAgenda definicionAgenda;
    private Prestador prestador;

    public void generarAgenda()
    {
        prestador.crearAgenda(definicionAgenda);
    }
}
