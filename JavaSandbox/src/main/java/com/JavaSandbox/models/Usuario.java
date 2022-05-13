package com.JavaSandbox.models;
import lombok.Data;

@Data
public class Usuario{
    private String clave;
    private String nickname;

    public boolean esUsuario(String nickname){
        if(this.nickname == nickname){
            return true;
        }
        return false;
    }
}

