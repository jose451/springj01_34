<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/rec/css/style.css">
</head>
<body>
<h1>Hola ${param.nombre}. bienvenido al curso de Spring </h1>

<h2>Atencion a todos</h2>
<p>

${mensajeClaro} mensaje  del controlador
</p>

<img alt="imgen" src="${pageContext.request.contextPath }/rec/img/des.jpg"/>


</body>
</html>