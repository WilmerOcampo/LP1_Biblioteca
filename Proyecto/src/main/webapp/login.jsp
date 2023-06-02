<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<title>Login</title>
</head>
<body class="bg-light">
	<div class="container mt-4 col-lg-4 d-flex justify-content-center">
		<div class="card col-sm-10">
			<div class="card-body">
				<form action="ControladorLogin" method="POST" class="form-sign">
					<div class="form-group text-center d-flex flex-column justify-content-center align-items-center">
						<h3 style="font-weight: 700; font-size: 2rem; text-transform: uppercase;">Login</h3>
						<img alt="Logo" src="img/people.svg" width="40%">
					</div>
					<div class="form-group">
						<label>Usuario:</label>
						<input type="text" name="idempleado" id="idempleado" class="form-control">
					</div>
					<br>
					<div class="form-group">
						<label>Password:</label>
						<input type="password" name="pass" id="pass" class="form-control">
					</div>
					<br>
					<div style="text-align: center">
						<input type="submit" name="instruccion" value="Ingresar" class="btn btn-success" style="font-weight: 600">
					</div>
					
				</form>
			</div>
		</div>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>