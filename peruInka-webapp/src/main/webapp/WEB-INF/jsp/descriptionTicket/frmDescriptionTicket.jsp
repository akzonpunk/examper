<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend>Formulario Ticket : ${opc}</legend>
			<form:form commandName="ticketDescription" action="saveTicketDescription" method="POST">

				<input type="text" name="id" id="id" value="${ticketDescription.id}">

				<table>

					<tr>
						<td>Usuario:</td>
						<td><form:input path="product.productId" id="productId" />
						<td />
					</tr>

					<tr>
						<td>Cantidad:</td>
						<td><form:input path="quantity" id="quantity" />
						<td />
					</tr>


					<tr>
						<td>Precio Por Unidad:</td>
						<td><form:input path="priceUnitary" id="priceUnitary" />
						<td />
					</tr>
					<tr>
						<td>Precio en Total:</td>
						<td><form:input path="priceAll" id="priceAll" />
						<td />
					</tr>
					<tr>
						<td>Comentario :</td>
						<td><form:input path="commet" id="commet" />
						<td />
					</tr>
<!-- 					<tr> -->
<!-- 						<td>Tipo Documento</td> -->
<%-- 						<td><form:select path="person.typeDocument.typeCode"> --%>
<!-- 								<option value="">Seleccione</option> -->
<%-- 								<form:options items="${typeDocument}" itemValue="typeCode" --%>
<%-- 									itemLabel="description" /> --%>
<%-- 							</form:select></td> --%>
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td>Numero de Documento:</td> -->
<%-- 						<td><form:input path="person.numDocument" id="numDocument" /> --%>
<!-- 						<td /> -->
<!-- 					</tr> -->

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


