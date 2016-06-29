<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Ticket

<br>
<a href="frmTicket">Nueva Ticket</a>
<br>

<display:table name="${listTicket}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
 	
	<display:column title="Cliente id" property="customerId" />
 	
	<display:column title="Persona" property="person" />
	
<%-- 	<display:column title="Ape Paterno" property="person.lastNameF" /> --%>
<%-- 	<display:column title="Ape Paterno" property="person.lastNameM" /> --%>
<%-- 	<display:column title="Tipo Documento" property="person.typeDocument.description" /> --%>
<%-- 	<display:column title="Numero Documento" property="person.numDocument" /> --%>
<%-- 	<display:column title="Estado" property="statusUser.description" /> --%>
	<display:column title="OPC">
		<a href="editTicket?id=${item.id}">Modificar</a>
		<a href="deleteTicket?id=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>