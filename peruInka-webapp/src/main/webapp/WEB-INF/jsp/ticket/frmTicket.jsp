<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENU</div>
		<div class="span10">


			<legend>Formulario Ticket : ${opc}</legend>
			<form:form commandName="ticket" action="saveTicket" method="POST">

				<input type="text" name="id" id="id" value="${ticket.id}">

				<table>

					<tr>
						<td>cliente id:</td>
						<td><form:input path="customer.customerId" id="customerId" />
						<td />
					</tr>

					<tr>
						<td>Persona:</td>
						<td><form:input path="person.person" id="person" />
						<td />
					</tr>


<!-- 					<tr> -->
<!-- 						<td>Nombre:</td> -->
<%-- 						<td><form:input path="person.name" id="name" /> --%>
<!-- 						<td /> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td>Apellido Paterno:</td> -->
<%-- 						<td><form:input path="person.lastNameF" id="lastNameF" /> --%>
<!-- 						<td /> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td>Apellido Materno:</td> -->
<%-- 						<td><form:input path="person.lastNameM" id="lastNameM" /> --%>
<!-- 						<td /> -->
<!-- 					</tr> -->
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

<!-- 					<tr> -->
<!-- 						<td>Estado</td> -->
<%-- 						<td><form:select path="statusUser.typeCode"> --%>
<!-- 								<option value="">Seleccione</option> -->
<%-- 								<form:options items="${statusUser}" itemValue="typeCode" --%>
<%-- 									itemLabel="description" /> --%>
<%-- 							</form:select></td> --%>
<!-- 					</tr> -->

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


