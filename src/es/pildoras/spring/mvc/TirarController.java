package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class TirarController {
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { // proporciona el formulario
		return "HolaAlumnosFormulario";
	}

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}

	@RequestMapping("/procesarFormulario2")
	// public String otroProcesarFormulario(HttpServletRequest request, Model model)
	// {
	public String otroProcesarFormulario(@RequestParam("nombre") String nombre, Model model) {

		// String nombre = request.getParameter("nombre");

		nombre += "es el mejor alumno";

		String mensajeFinal = "Quien es el mejor alumno? " + nombre;

		model.addAttribute("mensajeClaro", mensajeFinal);
		return "HolaAlumnosSpring";
	}
}
