package com.JavaSandbox.models;
import com.JavaSandbox.ControladorPantalla;
import java.util.ArrayList;

public class GestorCU {
    private ArrayList<AsignacionResponsableTecnicoRT> asignacionesRespTecRT = new ArrayList<>();
    private Sesion sesionActual = new Sesion();

    public GestorCU(){

    }
    public void iniciarCU(ControladorPantalla controladorPantalla){
        this.buscarRTDeUsuarioLogueado(controladorPantalla);
    }
    public void buscarRTDeUsuarioLogueado(ControladorPantalla controladorPantalla) {
        Usuario usuario = this.sesionActual.getUsuarioLogueado();
        for (AsignacionResponsableTecnicoRT asignacionRespTecRT : asignacionesRespTecRT) {
            if (asignacionRespTecRT.esDeUsuario(usuario)) {
                ArrayList<RecursoTecnologico> recursosTecnologicos = asignacionRespTecRT.getRecursosTecnologicos();
                controladorPantalla.mostrarDatosRT(recursosTecnologicos);
            }
        }
    }
}

