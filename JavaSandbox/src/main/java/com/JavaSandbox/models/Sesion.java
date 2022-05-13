package com.JavaSandbox.models;
import lombok.Data;
import java.util.Date;

@Data
public class Sesion {
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private Usuario usuarioLogueado;

    public String getNicknameUsuario() {
        return usuarioLogueado.getNickname();
    }
}


