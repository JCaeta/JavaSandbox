package com.JavaSandbox.models;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CambioEstadoTurno {
    LocalDateTime fechaHoraDesde;
    LocalDateTime fechaHoraHasta = null;
    Estado estado;

    public boolean esActual(){
        if (fechaHoraHasta == null)
        {
            return true;
        }
        return false;
    }

    public boolean esReservado()
    {
        return estado.esReservado();
    }

    public boolean esConfirmado()
    {
        return estado.esConfirmado();
    }
}

