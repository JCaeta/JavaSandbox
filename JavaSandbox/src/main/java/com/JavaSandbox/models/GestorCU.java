package com.JavaSandbox.models;
import java.time.LocalDate;
import java.util.ArrayList;
import com.JavaSandbox.Pantalla;

public class GestorCU {
    RecursoTecnologico recursoSeleccionado;
    LocalDate fechaPrevista;
    ArrayList<AsignacionCientificoDelCI> asignacionesCientificos;

    public GestorCU(){}

    public void buscarTurnosEnPlazo(Pantalla pantalla){
        // Buscar turnos en plazo
        ArrayList<Turno> turnosEnPlazo = recursoSeleccionado.getTurnosEnPlazo(fechaPrevista);

        // Obtener los datos de los turnos que tienen reserva pendiente o confirmada
        ArrayList<String[]> datosTurnos = new ArrayList<>();
        for(Turno turno: turnosEnPlazo)
        {
            if(turno.tieneReservaPendienteOConfirmada())
            {
                String datos[] = turno.mostrarTurno(asignacionesCientificos);
                datosTurnos.add(datos);
            }
        }

        // Agrupar turnos por cientifico
        agruparTurnosPorCientifico(datosTurnos);
    }

    public void agruparTurnosPorCientifico(ArrayList<String[]> datosTurnos)
    {
        // Código para agrupar...
    }
}



