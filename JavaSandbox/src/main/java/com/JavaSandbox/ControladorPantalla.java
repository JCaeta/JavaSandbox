package com.JavaSandbox;
import com.JavaSandbox.models.GestorCU;
import com.JavaSandbox.models.RecursoTecnologico;
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
    public void mostrarDatosRT(ArrayList<RecursoTecnologico> recursosTecnologicos) {
        String recursosString = "Recursos encontrados: ";
        if (recursosTecnologicos.size() > 0) {
            recursosString += recursosTecnologicos.get(0).getNumeroRT();
            for (int i = 1; i < recursosTecnologicos.size(); i++) {
                recursosString += ", " + recursosTecnologicos.get(i).getNumeroRT();
            }
        }
        this.model.addAttribute("recursos", recursosString);
    }
}





