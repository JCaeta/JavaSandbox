package com.JavaSandbox.models;
import lombok.Data;

@Data
public class PersonalCientifico {
    private String nombre;
    private Usuario usuario;

    public boolean esDeUsuario(Usuario usuario){
        if(this.usuario.esUsuario(usuario)) {
            return true;
        }
        return false;
    }
}

