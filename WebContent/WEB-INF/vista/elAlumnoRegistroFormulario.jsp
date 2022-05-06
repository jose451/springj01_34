<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
</head>
<body>

	<form:form action="procesarFormulario" modelAttribute="elAlumno">
    Nombre: <form:input path="nombre" />
		<form:errors path="nombre" style="color:red"></form:errors>
		<br>
		<br>  
Apellido: <form:input path="apellido" />
		<br />
		<br />
    Email: <form:input path="email" />
		<form:errors path="Email" style="color:red"></form:errors>
		<br />
		<br />
	   Codigo Postal <form:input path="codigoPostal" />
		<form:errors path="codigoPostal" style="color:red"></form:errors>
		<br />
		<br />
Edad:	<form:input path="edad" />
		<form:errors path="edad" style="color:red"></form:errors>
		<br />		
		Asignaturas Optativas:
		<br>
		<form:select path="optativa" multiple="true">

			<form:option value="Disenginio" label="Diseing"></form:option>
			<form:option value="karate" label="karate"></form:option>
			<form:option value="Comersion" label="Comersion"></form:option>
			<form:option value="Daza" label="Daza"></form:option>

		</form:select>
		<br />
		<br />
		Tlaxcala<form:radiobutton path="ciudadEstudios" value="tlaxcala" />
			CDMX<form:radiobutton path="ciudadEstudios" value="cdmx" />
				Hidalgo<form:radiobutton path="ciudadEstudios" value="hidalgo" />
		<br />
		<br />
			ingles <form:checkbox path="idioma" value="Ingles" />
				Aleman <form:checkbox path="idioma" value="Aleman" />
					franzes <form:checkbox path="idioma" value="Frances" />
					Chino <form:checkbox path="idioma" value="Chino" />
		<br />
		<br />
		<input type="submit" value="EnviarDatosAlumno" />

	</form:form>


</body>
</html>