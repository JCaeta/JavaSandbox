package com.RecursosTecnologicos.dummy_data;

import com.RecursosTecnologicos.models.PersonalCientifico;
import com.RecursosTecnologicos.models.Usuario;

public class GeneradorDummyPersonalCientifico {
    public static PersonalCientifico generarPersonalCientifico() {
        PersonalCientifico personalCientifico = new PersonalCientifico();

        Usuario usuario = GeneradorDummyUsuario.generarUsuario();
        personalCientifico.setNombre(RandomNameGenerator.getName());
        personalCientifico.setUsuario(usuario);

        return personalCientifico;
    }

    public static PersonalCientifico generarPersonalCientifico(String nombre) {
        PersonalCientifico personalCientifico = new PersonalCientifico();

        Usuario usuario = GeneradorDummyUsuario.generarUsuario();
        personalCientifico.setNombre(nombre);
        personalCientifico.setUsuario(usuario);

        return personalCientifico;
    }

    public static PersonalCientifico generarPersonalCientifico(Usuario usuario) {
        PersonalCientifico personalCientifico = new PersonalCientifico();
        personalCientifico.setNombre(RandomNameGenerator.getName());
        personalCientifico.setUsuario(usuario);

        return personalCientifico;
    }

    public static PersonalCientifico generarPersonalCientifico(String nombre, Usuario usuario) {
        PersonalCientifico personalCientifico = new PersonalCientifico();
        personalCientifico.setNombre(nombre);
        personalCientifico.setUsuario(usuario);

        return personalCientifico;
    }
}
