package com.JavaSandbox.models;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Agenda {
    private DefinicionAgenda definicionAgenda;
    private ArrayList<Turno> turnos;
    private int mes;
    private int anio;

    Agenda(DefinicionAgenda definicionAgenda)
    {
        this.definicionAgenda = definicionAgenda;
        this.crearTurnos();
    }

    public void crearTurnos()
    {
        boolean parar = false;

        int anio = definicionAgenda.getAnio();
        int mes = definicionAgenda.getMes();
        int duracionTurno = definicionAgenda.getDuracionTurno();
        int intervaloEntreTurnos = definicionAgenda.getIntervaloEntreTurnos(); 
        LocalDateTime fechaHora = LocalDateTime.of(anio, mes, 1, 0, 0); 

        DayOfWeek diaSemana = fechaHora.getDayOfWeek();
        System.out.println(diaSemana);

        // ArrayList<DetalleDefinicionAgenda> detallesLunes = new ArrayList<>();
        // ArrayList<DetalleDefinicionAgenda> detallesMartes = new ArrayList<>();
        // ArrayList<DetalleDefinicionAgenda> detallesMiercoles = new ArrayList<>();
        // ArrayList<DetalleDefinicionAgenda> detallesJueves = new ArrayList<>();
        // ArrayList<DetalleDefinicionAgenda> detallesViernes = new ArrayList<>();
        // ArrayList<DetalleDefinicionAgenda> detallesSabado = new ArrayList<>();
        // ArrayList<DetalleDefinicionAgenda> detallesDomingo = new ArrayList<>();

        // for(DetalleDefinicionAgenda detalle: this.definicionAgenda.getDetallesDefinicionAgenda())
        // {
        //     if(detalle.getDiaSemana() == "Lunes")
        //     {
        //         detallesLunes.add(detalle);
        //     }

        //     if(detalle.getDiaSemana() == "Martes")
        //     {
        //         detallesMartes.add(detalle);
        //     }

        //     if(detalle.getDiaSemana() == "Miercoles")
        //     {
        //         detallesMiercoles.add(detalle);
        //     }

        //     if(detalle.getDiaSemana() == "Jueves")
        //     {
        //         detallesJueves.add(detalle);
        //     }

        //     if(detalle.getDiaSemana() == "Viernes")
        //     {
        //         detallesViernes.add(detalle);
        //     }

        //     if(detalle.getDiaSemana() == "Sabado")
        //     {
        //         detallesSabado.add(detalle);
        //     }

        //     if(detalle.getDiaSemana() == "Domingo")
        //     {
        //         detallesDomingo.add(detalle);
        //     }
        // }

        // while(parar == false)
        // {

        //     {

        //     }

        //     Turno nuevoTurno = new Turno();

        // }
    }
}






