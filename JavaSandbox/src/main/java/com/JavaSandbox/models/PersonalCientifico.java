package com.JavaSandbox.models;
import lombok.Data;

@Data
public class PersonalCientifico {
    private String nombre;
    private Usuario usuario;

    public boolean esDeUsuario(String usuarioNickname){
        if(usuario.esUsuario(usuarioNickname)){
            return true;
        }
        return false;
    }
}

