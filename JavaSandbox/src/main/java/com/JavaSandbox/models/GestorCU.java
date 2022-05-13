package com.JavaSandbox.models;
import java.util.ArrayList;
import com.JavaSandbox.ControladorPantalla;

public class GestorCU {
    private ArrayList<AsignacionResponsableTecnicoRT> asignacionesRespTecRT = new ArrayList<>();
    private Sesion sesionActual = new Sesion();

    public GestorCU(){}
    public void iniciarCU(ControladorPantalla controladorPantalla){
        this.buscarRTDeUsuarioLogueado(controladorPantalla);
    }
    public void buscarRTDeUsuarioLogueado(ControladorPantalla controladorPantalla) {
        String usuarioNickname = this.sesionActual.getNicknameUsuario();
        for (AsignacionResponsableTecnicoRT asignacionRespTecRT : asignacionesRespTecRT) {
            if (asignacionRespTecRT.esDeUsuario(usuarioNickname)) {
                ArrayList<String> datosRT = asignacionRespTecRT.getDatosRT();
                controladorPantalla.mostrarDatosRT(datosRT);
            }
        }
    }
}

