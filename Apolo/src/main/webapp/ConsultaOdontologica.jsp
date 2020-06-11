<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">	
</script>



<body>
<form action="ServletConsultaOdontologica" method="get">
<label>Consulta Odontologica</label>

<br>
<label>Cedula:</label>
<br>
<input type="text" name="Odontologo" placeholder="int  sera la cedula del doctor">
<br>
<label>Codigo Consulta:</label>
<br>
<input type="text" name="Codigo_ConsultaO" placeholder="Codigo de Consulta">
<br>
<label>Codigo de Expediente</label>
<br>
<input type="text" name="Paciente" placeholder="int">
<br>
<label>Sitomas:</label>
<br>
<input type="text" name="Sintomas" placeholder="string">
<br>
<label>Enfermedades</label>
<br>
<input type="text" name="Enfermedad_Odontologica" placeholder="">
<input type="submit" name="Recetar" placeholder="btnEnviar">
<a href="RecetarOdonto.jsp" class="btn btn-warning">Recetar</a>
<a href="Doctor.jsp" class = "btn btn-warning">salir</a></form>




</body>
</html>