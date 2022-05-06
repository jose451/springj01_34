package es.pildoras.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/alumno")
public class AlumnoControler {
	
	@RequestMapping("/muestraformulario")
	public String muestraFormulario(Model model) {

		Alumno elAlumno = new Alumno();
		model.addAttribute("elAlumno", elAlumno);
		return "elAlumnoRegistroFormulario";		
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("elAlumno")Alumno elAlumno, BindingResult resultadoValidacion) {
		if(resultadoValidacion.hasErrors()) {
			return "elAlumnoRegistroFormulario";		
		}else {
			return "confirmacionRegistroAlumno";
		}				
	}
	@InitBinder
	public void miBinder(WebDataBinder binder){
		StringTrimmerEditor recortaEspaciosBlanco = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,recortaEspaciosBlanco);
	}
	
}
