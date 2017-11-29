<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="rich" uri="http://richfaces.org/rich"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t" %>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j" %>

<tiles:useAttribute name="messageBundle" id="messageBundle_string" ignore="true" classname="java.lang.String" scope="session" />
<tiles:useAttribute name="css" classname="java.util.List" scope="request" ignore="true" />
<tiles:useAttribute name="js" classname="java.util.List" scope="request" ignore="true" />
<tiles:useAttribute name="css_infra" classname="java.util.List" scope="request" ignore="true" />
<tiles:useAttribute name="js_infra" classname="java.util.List" scope="request" ignore="true" />

<f:view>

	<head>	
		<meta http-equiv="Pragma" content="no-cache" />
		<meta http-equiv="Content-Type" content="text/html;CHARSET=iso-8859-1" />

		<title>Projeto Final</title>

		<!--  Add Css  -->		
		<c:forEach var="itemCss" items="#{css_infra}" >			
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
		
		<tiles:insert attribute="body" flush="false" ignore="true" />
		
	</body>
		
</f:view>
</html>
