<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Producto

<br>
<a href="frmProduct">Nueva Producto</a>
<br>

<display:table name="${listProduct}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
 	
	<display:column title="Nombre Producto" property="nameProduct" />
 	
	<display:column title="Precio del Producto" property="priceProduct" />
	<display:column title="Descripcion" property="description" />
	<display:column title="Attributos" property="attributes" />
	<display:column title="Hotel" property="hotel.hotelId" />
	<display:column title="Tipo de producto" property="productType" />
	<display:column title="Estado" property="statusProduct.description" />
	
	<display:column title="Persona" property="person" />

	
	<display:column title="OPC">
		<a href="editProduct?id=${item.id}">Modificar</a>
		<a href="deleteProduct?id=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>