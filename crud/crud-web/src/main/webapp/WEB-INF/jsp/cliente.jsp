<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>


<t:div styleClass="container">

	<t:div styleClass="row">

		<h:form styleClass="col s12">

			<t:div styleClass="row">

				<t:div styleClass="input-field col s12">
					<t:inputText id="nomePesquisa" value="">
					</t:inputText>

					<t:commandButton action="" value="Pesquisar"
						styleClass="waves-effect waves-light btn" />

				</t:div>

			</t:div>

		</h:form>

	</t:div>

</t:div>