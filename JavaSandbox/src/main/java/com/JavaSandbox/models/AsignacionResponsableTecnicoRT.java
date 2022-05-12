//----------------------------------------------------------------------------------- Version 1
package com.RecursosTecnologicos.models;
import lombok.Data;
import java.util.ArrayList;

@Data
public class AsignacionResponsableTecnicoRT {
    private ArrayList<RecursoTecnologico> recursosTecnologicos = new ArrayList<>();
    private PersonalCientifico personalCientifico;

    public boolean esDeUsuario(Usuario usuario){
        return personalCientifico.esDeUsuario(usuario);
    }
}





// ----------------------------------------------------------------------------------- Version 2
//    public boolean esDeUsuario(String nombreUsuario) {
//        return personalCientifico.esDeUsuario(nombreUsuario);
//        return false;
//    }



//    public ArrayList<String> getDatosRecursosTecnologicos()
//    {
//        ArrayList<String> datos = new ArrayList<>();
//        for(RecursoTecnologico recurso : recursos)
//        {
//            datos.add(recurso.getDatos());
//        }
//        return datos;
//    }