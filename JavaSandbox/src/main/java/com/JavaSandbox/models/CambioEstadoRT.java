package com.JavaSandbox.models;
import lombok.Data;
import java.util.Date;

@Data
public class CambioEstadoRT {

    private Date fechaHoraDesde = null;
    private Date fechaHoraHasta = null;
    private Estado estado = new Estado();

    public boolean esActual()
    {
        return (fechaHoraHasta == null);
    }

    public boolean esDisponible()
    {
        // estado.esDisponible();
        return false;
    }
}

