<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend>Formulario Producto : ${opc}</legend>
			<form:form commandName="product" action="saveProduct" method="POST">

				<input type="text" name="id" id="id" value="${product.id}">

				<table>

					<tr>
						<td>Nombre Producto:</td>
						<td><form:input path="nameProduct" id="nameProduct" />
						<td />
					</tr>

					<tr>
						<td>Precio:</td>
						<td><form:input path="priceProduct" id="priceProduct" />
						<td />
					</tr>


					<tr>
						<td>Descripcion:</td>
						<td><form:input path="description" id="description" />
						<td />
					</tr>
					<tr>
						<td>Atributos:</td>
						<td><form:input path="attributes" id="attributes" />
						<td />
					</tr>
					<tr>
						<td>Hotel id:</td>
						<td><form:input path="hotel.hotelId" id="hotelId" />
						<td />
					</tr>
					
					<tr>
						<td>Tipo de Producto:</td>
						<td><form:input path="productType" id="productType" />
						<td />
					</tr>
					
					<tr>
						<td>Persona:</td>
						<td><form:input path="person.person" id="person" />
						<td />
					</tr>				
					
					
					<tr>
						<td>Estado</td>
						<td><form:select path="statusProduct.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusProduct}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>

					<tr>
						<td colspan="2"><button type="submit" class="btn btn-success">Guardar</button>
						<td />
					</tr>
				</table>

				<%-- DNI: <form:input path="dni" id="dni"/><br> --%>

				<input type="hidden" name="opc" id="opc" value="${opc}">
				<br>


			</form:form>


		</div>
	</div>
</div>


