<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Gerenciador de Clientes</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">

</head>

<body>

	<div class="container">

		<form class="form-signin" action="/cliente-web/LoginServlet" method="post">
		
			<h2 class="form-signin-heading">Login</h2>
			
				<label for="inputEmail" class="sr-only">Usuario</label>						
				<input type="text" id="inputEmail" class="form-control"
				placeholder="Usuario" name="txtUsuario" required autofocus /> 
				
				<label for="inputPassword" class="sr-only">Senha</label> 
				<input type="password" id="inputPassword" name="txtSenha" 
				class="form-control" placeholder="Senha" required />
	
			<button class="btn btn-lg btn-primary btn-block btn-login" type="submit">Login</button>
			 
		</form>
				
			<div class="alert alert-danger ${empty erroLogin ? 'none' : ''}" >
  				<center><strong>${erroLogin}</strong></center>
			</div>
 
	</div>
	

</body>
</html>

















