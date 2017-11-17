<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page language="java" import="java.util.List" %>
<%@ page language="java" import="br.com.cliente.model.Cliente" %>
	
	
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
			<a class="navbar-brand" href="#">Gerenciador de Clientes</a>
		</div>
		
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="login.jsp">Login</a></li>
			</ul>
		</div>
		
	</div>
	</nav>

	<div id="main" class="container-fluid" style="margin-top: 50px">

		<div id="top" class="row">			
			<div class="col-sm-3">
				<h2>Clientes Web</h2>
			</div>			
			<div class="col-sm-6">
				<div class="input-group h2">
					<input name="data[search]" class="form-control" id="search"
						type="text" placeholder="Pesquisar Clientes"> <span
						class="input-group-btn">
						<button class="btn btn-primary" type="submit" style="height: 34px;">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</span>
				</div>
			</div>			
			<div class="col-sm-3">
				<a href="manutencao.jsp" class="btn btn-primary pull-right h2">Novo Item</a>
			</div>			
		</div>
			<%
				List<Cliente> lista = (List<Cliente>) request.getAttribute("clientes");
			%>

		<hr />
		<div id="list" class="row">
		
		
			<div class="table-responsive col-md-12">
		
				<table class="table table-striped" cellspacing="0" cellpadding="0">
					<thead>
						<tr>
							<th>ID</th>
							<th>Nome Completo</th>
							<th>Idade</th>
							<th class="actions">Ações</th>
						</tr>
					</thead>
					<tbody>
						
						<%
							for(Cliente item : lista) {
						%>																	
						<tr>
							<td><%= item.getId() %></td>
							<td><%= item.getNomeCompleto() %></td>
							<td><%= item.getIdade() %></td>							
							<td class="actions">
								<a class="btn btn-warning btn-xs" href="manutencao.jsp">Editar</a> 
								<a class="btn btn-danger btn-xs" href="#" data-toggle="modal" data-target="#delete-modal">Excluir</a>
							</td>
						</tr>						
						<% 
						} 						
						%>	
														
					</tbody>
				</table>
				
				
			</div>

		</div>
		
	</div>

	<!-- Modal -->
	<div class="modal fade" id="delete-modal" tabindex="-1" role="dialog"
		aria-labelledby="modalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="modalLabel">Excluir Item</h4>
				</div>
				<div class="modal-body">Deseja realmente excluir este item?</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">Sim</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
				</div>
			</div>
		</div>
	</div>

	<script src="js/jquery.min.js"></script>
	
	<script src="js/bootstrap.min.js"></script>

</body>
</html>