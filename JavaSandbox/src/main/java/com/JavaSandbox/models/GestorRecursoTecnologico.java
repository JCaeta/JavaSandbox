// --------------------------------------------------------------------------------------------- Version 1
package com.RecursosTecnologicos.models;

import java.util.ArrayList;

public class GestorRecursoTecnologico {
    private Sesion sesionActual;
//    private ArrayList<RecursoTecnologico> recursos;
    private ArrayList<AsignacionResponsableTecnicoRT> asignacionesResponsableTecnicoRT;

    public void BuscarRTDeUsuarioLogueado() {
        Usuario usuarioLogueado = sesionActual.getUsuarioLogueado();
        for(AsignacionResponsableTecnicoRT asignacionResponsableTecnicoRT : asignacionesResponsableTecnicoRT) {
            if(asignacionResponsableTecnicoRT.esDeUsuario(usuarioLogueado)) {
                 ArrayList<RecursoTecnologico> recursos = asignacionResponsableTecnicoRT.getRecursosTecnologicos();

            }
        }
    }
}


//    public void BuscarRTDeUsuarioLogueado() {
//        String nicknameUsuario = this.sesionActual.getNicknameUsuario();
//        for(AsignacionResponsableTecnicoRT asignacion : this.asignacionesResponsableTecnicoRT) {
//            if (asignacion.esDeUsuario(nicknameUsuario)) {
//                this.recursos = asignacion.getRecursosTecnologicos();
//                break;
//            }
//        }
//    }