package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	@RequestMapping("/")
	public String muestaraPagina() {
		return "pagina"; ///Spring_mvc/WebContent/WEB-INF/vista/paginaEjemplo.jsp
	}
	
}
