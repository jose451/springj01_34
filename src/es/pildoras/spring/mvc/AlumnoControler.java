package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoControler {
	
	@RequestMapping("/muestraformulario")
	public String muestraFormulario(Model model) {

		return "vistas";
	}
	
}
