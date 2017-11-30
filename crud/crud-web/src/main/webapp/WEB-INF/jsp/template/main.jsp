<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="rich" uri="http://richfaces.org/rich"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<tiles:useAttribute name="messageBundle" id="messageBundle_string"
	ignore="true" classname="java.lang.String" scope="session" />
<tiles:useAttribute name="css" classname="java.util.List"
	scope="request" ignore="true" />
<tiles:useAttribute name="js" classname="java.util.List" scope="request"
	ignore="true" />
<tiles:useAttribute name="css_infra" classname="java.util.List"
	scope="request" ignore="true" />
<tiles:useAttribute name="js_infra" classname="java.util.List"
	scope="request" ignore="true" />
	
<tiles:useAttribute name="subtitulo" classname="java.lang.String" 
	scope="request" ignore="true" />

<f:view>

	<head>
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Content-Type" content="text/html;CHARSET=iso-8859-1" />

<title>Projeto Final</title>

<!--  Add Css  -->
<c:forEach var="itemCss" items="#{css_infra}">
	<link href="${itemCss.link}" rel="stylesheet">
</c:forEach>
<c:forEach var="itemCSS" items="#{css}">
	<link href="${itemCss.link}" rel="stylesheet">
</c:forEach>

<!--  Add Js  -->
<c:forEach var="itemJS" items="#{js_infra}">
	<script src="${itemJS.link}"></script>
</c:forEach>
<c:forEach var="itemJS" items="#{js}">
	<script src="${itemJS.link}"></script>
</c:forEach>

<script type="text/javascript">
<!--
	jQuery.noConflict();
	-->
</script>

	</head>

	<body>
	
		<t:inputText styleClass="form-control" id="txtPesquisa2" value="">
			<t:outputText styleClass="input-group-btn" />
		</t:inputText>

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
			</div>
		</nav>
		
		<div id="main" class="container-fluid" style="margin-top: 50px">
			<div id="top" class="row">
				<div class="col-sm-3">
					<h2>${subtitulo}</h2>
				</div>
			</div>
		</div>

		<tiles:insert attribute="body" flush="false" ignore="true" />

	</body>

</f:view>
</html>
