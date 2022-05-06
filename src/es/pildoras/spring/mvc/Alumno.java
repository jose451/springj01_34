package es.pildoras.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
public class Alumno {
	
	@NotNull
	@Size(min=2 , message="El nombre es requerido")
	private String nombre;
	private String Apellido;
	private String Optativa;
	
	private String CiudadEstudios;
	private String Idioma;
	
	@Min(value=1, message="Edad no permitida")
	@Max(value=120, message="Edad no permitida")
	private int Edad;
	
	@Email
	private String Email;
	
	@Pattern(regexp = "[0-9]{5}",message="Solo 5 valores numericos")
	private String codigoPostal;
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getOptativa() {
		return Optativa;
	}

	public void setOptativa(String optativa) {
		Optativa = optativa;
	}

	public String getCiudadEstudios() {
		return CiudadEstudios;
	}

	public void setCiudadEstudios(String ciudadEstudios) {
		CiudadEstudios = ciudadEstudios;
	}

	public String getIdioma() {
		return Idioma;
	}

	public void setIdioma(String idioma) {
		Idioma = idioma;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
	

}
