<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion de registro</title>
</head>
<body>
<h3>El Alumno ${elAlumno.nombre} con nombre , apellido ${elAlumno.apellido} con , edad <strong> ${elAlumno.edad}</strong> y email ${elAlumno.email}</h3>
<p>El Codigo postal ${elAlumno.codigoPostal} </p>
<p>La asignatura escogida es ${elAlumno.optativa} </p>
<p>La el campus del alumno es : ${elAlumno.ciudadEstudios} </p>

<p>Los idiomas seleccionados por el alumno son : ${elAlumno.idioma} </p>
</body>
</html>