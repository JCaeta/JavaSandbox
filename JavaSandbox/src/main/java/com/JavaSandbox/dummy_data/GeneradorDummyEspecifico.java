package com.RecursosTecnologicos.dummy_data;

import com.RecursosTecnologicos.models.PersonalCientifico;
import com.RecursosTecnologicos.models.Usuario;

public class GeneradorDummyEspecifico {
    public Usuario usuarioComun = GeneradorDummyUsuario.generarUsuario();

    public void generarUsuario()
    {
        Usuario usuario = new Usuario();

        PersonalCientifico personalCientifico = GeneradorDummyPersonalCientifico.generarPersonalCientifico(usuario);


    }
}
