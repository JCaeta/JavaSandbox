package com.JavaSandbox.models;
import java.util.ArrayList;
import com.JavaSandbox.Pantalla;

public class GestorCU {
    private ArrayList<AsignacionResponsableTecnicoRT> asignacionesRespTecRT = new ArrayList<>();
    private ArrayList<RecursoTecnologico> recursosTecnologicos = new ArrayList<>();
    private Sesion sesionActual = new Sesion();

    public GestorCU(){}
    public void iniciarCU(Pantalla pantalla){
//        this.buscarRTDeUsuarioLogueado(pantalla);
        this.buscarRTDisponibles();

    }
    public void buscarRTDeUsuarioLogueado(Pantalla pantalla) {
        String usuarioNickname = this.sesionActual.getNicknameUsuario();
        for (AsignacionResponsableTecnicoRT asignacionRespTecRT : asignacionesRespTecRT) {
            if (asignacionRespTecRT.esDeUsuario(usuarioNickname)) {
                ArrayList<String> datosRT = asignacionRespTecRT.getDatosRT();
                pantalla.mostrarDatosRT(datosRT);
            }
        }
    }

    public void buscarRTDisponibles() {
        ArrayList<RecursoTecnologico> rtDisponibles = new ArrayList<>();
        for(RecursoTecnologico recursoTecnologico : recursosTecnologicos){
            if(recursoTecnologico.estaDisponible()){
                rtDisponibles.add(recursoTecnologico);
            }
        }
    }
}



