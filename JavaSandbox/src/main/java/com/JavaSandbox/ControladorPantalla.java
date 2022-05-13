package com.JavaSandbox;
import com.JavaSandbox.models.GestorCU;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
@Controller
public class ControladorPantalla {
    private GestorCU gestorCU = new GestorCU();
    private Model model;

    @GetMapping("/")
    public String habilitarPantalla(Model model) {
        this.model = model;
        gestorCU.iniciarCU(this);

        return "index";
    }
    public void mostrarDatosRT(ArrayList<String> datosRT) {
        String recursosString = "Recursos encontrado ";
        if (datosRT.size() > 0) {
            recursosString += datosRT.get(0);
            for (int i = 1; i < datosRT.size(); i++) {
                recursosString += ", " + datosRT.get(i);
            }
        }
        this.model.addAttribute("recursos", recursosString);
    }
}





