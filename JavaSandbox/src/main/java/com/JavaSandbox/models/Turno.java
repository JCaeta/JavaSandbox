package com.JavaSandbox.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Turno {
    LocalDateTime fechaHoraInicio;
    LocalDateTime fechaHoraFin;
    ArrayList<CambioEstadoTurno> cambiosEstadoTurno;
    
    public boolean estaEnPlazo(LocalDate fecha){
        LocalDate fechaInicio = LocalDate.of(fechaHoraInicio.getYear(), 
                                             fechaHoraInicio.getMonth(), 
                                             fechaHoraInicio.getDayOfMonth());

        LocalDate fechaFin = LocalDate.of(fechaHoraFin.getYear(), 
                                          fechaHoraFin.getMonth(), 
                                          fechaHoraFin.getDayOfMonth());

        if(fecha.isAfter(fechaInicio) && fecha.isBefore(fechaFin)){
            return true;
        }
        return false;
    }

    public boolean tieneReservaPendienteOConfirmada(){
        for(CambioEstadoTurno cambioEstadoTurno : cambiosEstadoTurno){
            if(cambioEstadoTurno.esActual()){
                if(cambioEstadoTurno.esReservado() || cambioEstadoTurno.esConfirmado()){
                    return true;
                }
            }
        }
        return false;
    }

    public String[] mostrarTurno(ArrayList<AsignacionCientificoDelCI> asignacionesCientificos){
        String[] datosTurno = new String[3];
        datosTurno[0] = fechaHoraInicio.toString();
        datosTurno[1] = fechaHoraFin.toString();
        String datosCientifico[] = mostrarCientificoDelCI(asignacionesCientificos); 
        datosTurno[2] = datosCientifico[0] + " " + datosCientifico[1];
        return datosTurno;
    }

    public String[] mostrarCientificoDelCI(ArrayList<AsignacionCientificoDelCI> asignacionesCientificos){
        for(AsignacionCientificoDelCI asignacionCientifico : asignacionesCientificos)
        {
            for(Turno turno : asignacionCientifico.getTurnos())
            {
                if(turno.equals(this))
                {
                    return asignacionCientifico.mostrarCientificoDelCI();
                }
            }
        }
        // Si no hay datos retorna un array vacío
        String datos[] = new String[0];
        return datos;
    }
}

