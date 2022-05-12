package com.RecursosTecnologicos.dummy_data;
import com.RecursosTecnologicos.models.Usuario;
import lombok.Data;

import java.util.Random;

@Data
public class GeneradorDummyUsuario {
    static private Random randomNumbersGenerator = new Random();
    static public Usuario generarUsuario() {
        Usuario usuario = new Usuario();
        int randomNum = randomNumbersGenerator.nextInt(100);
        usuario.setNickname("Usuario " + randomNum);
        usuario.setClave("Clave " + randomNum);
        return usuario;
    }
}
