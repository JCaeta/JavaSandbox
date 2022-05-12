package com.RecursosTecnologicos.dummy_data;

import com.RecursosTecnologicos.models.Sesion;
import com.RecursosTecnologicos.models.Usuario;
import lombok.Data;

import java.util.Date;

@Data
public class GeneradorDummySesion {

    static public Sesion generarSesion(){
        Date fechaHoraInicio = new Date(System.currentTimeMillis());
        Usuario usuario = new GeneradorDummyUsuario().generarUsuario();
        Sesion sesion = new Sesion();
        sesion.setFechaHoraInicio(fechaHoraInicio);
        sesion.setUsuarioLogueado(usuario);
        return sesion;
    }
}
