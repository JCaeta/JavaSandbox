package com.JavaSandbox.models;
import lombok.Data;

@Data
public class Usuario{
    private String clave;
    private String nickname;

    public boolean esUsuario(Usuario usuario){
        if(nickname == usuario.getNickname()) {
            return true;
        }
        return false;
    }
}

