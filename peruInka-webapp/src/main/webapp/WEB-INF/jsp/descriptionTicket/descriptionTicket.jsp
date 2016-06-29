<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Descripcion Ticket

<br>
<a href="frmTicketDescription">Nueva Descripcion Ticket</a>
<br>

<display:table name="${listDescriptionTicket}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
 	
	<display:column title="Producto Id" property="product.productId" />
 	
	<display:column title="Ticket Id" property="ticket.ticketId" />
	<display:column title="Cantidad" property="quantity" />
	<display:column title="Precio Por Unidad" property="priceUnitary" />
	<display:column title="Precio Total" property="priceAll" />
	<display:column title="Comentario" property="commet" />
	<display:column title="Estado" property="statusProduct.description" />
	<display:column title="OPC">
		<a href="editDescriptionTicket?id=${item.id}">Modificar</a>
		<a href="deleteDescriptionTicket?id=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>