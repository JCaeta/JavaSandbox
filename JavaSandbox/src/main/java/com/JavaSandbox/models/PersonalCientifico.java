package com.RecursosTecnologicos.models;
import lombok.Data;

@Data
public class PersonalCientifico {
    private String nombre;
    private Usuario usuario;

    public boolean esDeUsuario(Usuario usuario){
        if(this.usuario.getNickname() == usuario.getNickname()){
            return true;
        }
        return false;
    }
}

