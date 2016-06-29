<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Cliente
<br>
<a href="frmCliente">Nueva Cliente</a>
<br>

<display:table name="${listCustomer}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
 	
	<display:column title="Ingresar el price" property="enterPriceId" />
 	
	<display:column title="Persona Id" property="personId" />
	
<%-- 	<display:column title="Ape Paterno" property="person.lastNameF" /> --%>
<%-- 	<display:column title="Ape Paterno" property="person.lastNameM" /> --%>
<%-- 	<display:column title="Tipo Documento" property="person.typeDocument.description" /> --%>
	
	<display:column title="Persona" property="person" />
	<display:column title="Estado" property="statusCustomer.description" />
	<display:column title="OPC">
		<a href="editCustomer?id=${item.id}">Modificar</a>
		<a href="deleteCustomer?id=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>