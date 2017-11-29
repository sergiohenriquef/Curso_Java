<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="rich" uri="http://richfaces.org/rich"%>

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

<f:view>

	<head>
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Content-Type" content="text/html;CHARSET=iso-8859-1" />

<title>Projeto Final</title>

<rich:dataList var="itemCss" value="#{css_infra}"
	rendered="#{css_infra != null}">
	<link href="#{itemCss}" rel="stylesheet">
</rich:dataList>

<rich:dataList var="itemCSS" value="#{css}" rendered="#{css != null}">
	<link href="#{itemCss}" rel="stylesheet">
</rich:dataList>

<rich:dataList var="itemJS" value="#{js_infra}"
	rendered="#{js_infra != null}">
	<script src="#{itemJS }"></script>
</rich:dataList>

<rich:dataList var="itemJS" value="#{js}" rendered="#{js != null}">
	<script src="#{itemJS }"></script>
</rich:dataList>

<script type="text/javascript">
<!--
	jQuery.noConflict();
	-->
</script>

	</head>

	<body>

		<tiles:put name="body" beanName="body" />

	</body>
</f:view>
</html>
