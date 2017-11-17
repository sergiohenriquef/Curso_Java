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
</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">Gerenciador de Clientes</a>
			</div>	
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Login</a></li>
				</ul>
			</div>
		</div>	
	</nav>

	<div id="main" class="container-fluid">
		<h3 class="page-header">Adicionar Cliente</h3>
		
		
		<form action="index.jsp">
			<div class="row">
			
				<div class="form-group col-md-4">
					<label for="txtNome">Nome</label> 
					<input	type="text" class="form-control" id="txtNome" name="txtNome"
						placeholder="Digite o Nome">
				</div>
				
				<div class="form-group col-md-4">
					<label for="txtSobrenome">Sobrenome:</label> 
					<input type="text" class="form-control" id="txtSobrenome"
						name="txtSobrenome"	placeholder="Digite o nome">
				</div>
				
				<div class="form-group col-md-4">
					<label for="txtIdade">Idade:</label> 
					<input type="text" class="form-control" id="txtIdade"
						name="txtIdade"	placeholder="Digite o nome">
				</div>
				
			</div>
			
			<div class="row">
				<div class="col-md-12">
					<button type="submit" class="btn btn-primary">Salvar</button>
					<a href="index.jsp" class="btn btn-default">Cancelar</a>
				</div>
			</div>
			
		</form>
		
		
	</div>


	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>



</body>
</html>