package com.JavaSandbox;
import com.JavaSandbox.models.GestorCU;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class Pantalla {
    private GestorCU gestorCU;

    public String habilitarpantalla(Model model){
        gestorCU = new GestorCU();
        gestorCU.iniciarCU(this);

        return "index";
    }
    
    public void mostrarDatos(ArrayList<String[]> datosDatos) {
        // Código para mostrar datos...
    }
}





