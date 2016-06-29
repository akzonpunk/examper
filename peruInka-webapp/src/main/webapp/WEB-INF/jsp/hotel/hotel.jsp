<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Hoteles

<br>
<a href="frmHotel">Nueva Hotel</a>
<br>

<display:table name="${listHotel}" id="item" class="table">

 	<display:column title="Codigo" property="id" />
 	
<%-- 	<display:column title="Usuario" property="userName" /> --%>
 	
	<display:column title="Nombre Hotel" property="nameHotel" />
	<display:column title="Ruc" property="ruc" />
	<display:column title="Direccion " property="address" />
	
<%-- 	<display:column title="Tipo Documento" property="person.typeDocument.description" /> --%>
	
	<display:column title="Persona Id" property="person.personId" />
	<display:column title="Estado" property="statusHotel.description" />
	<display:column title="OPC">
		<a href="editHotel?id=${item.id}">Modificar</a>
		<a href="deleteHotel?id=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>