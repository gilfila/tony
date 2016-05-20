<!DOCTYPE html>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<c:set var="resources"
	value="${pageContext.request.contextPath}/resources" />
<!-- Template Title -->
<title>JITS</title>


<%@ include file="stylesheets.jsp"%>


</head>
<body>

	<!-- ====== Menu Section ====== -->

	<%@ include file="header.jsp"%>

	<!-- ====== End Menu Section ====== -->

	<section>
		<h1>INPUT DELIVERY</h1>
		<form:form commandName="delfrm" action="inputDelivery">
			<form:errors path="*" cssClass="errorblock" element="div"></form:errors>
		
			<div>
				<input class="btn" type="button" value="${carrier.name}">
			</div>
			<div>
				<span><label>Priority Options</label> <form:select path="priority" items="${carrier.tariffs}" itemLabel="duration" required="true"></form:select></span> 
				<span><label>Delivery Type</label> <form:select path="deliveryType" items="${deliveryTypes}" required="true"></form:select></span>
			</div>
			<div>
				<span><label>Weight</label> <form:input type="number" step="0.01" min="0" path="weight"  required="true"></form:input></span>
				<span><label>Discount Code</label> <form:select items="${discountCodes}"  path="discountCode" required="true"></form:select></span>
			</div>

			<div class="inlineBlock">
				
				<div class="right">
						<label>Origin Street</label>
						<form:input path="originStreet" required="true"></form:input>
				</div>					
					<div class="right">
						<label>Origin City</label> <form:input path="originCity" required="true"></form:input>
						</div>
					
				<div class="right">
						<label>Origin State</label> <form:input path="originState" required="true" class="state" maxlength="2"></form:input>
						</div>
					
				<div class="right">
						<label>Origin Zip</label> <form:input path="originZip" required="true"></form:input>
						</div>
				
				</div> 
			<div class="inlineBlock">
				<div class="right">
						<label>Destination Street</label> <form:input path="destStreet" required="true"></form:input></div>
					
				<div class="right">
						<label>Destination City</label> <form:input path="destCity" required="true"></form:input></div>
					
				<div class="right">
						<label>Destination State</label> <form:input path="destState" required="true" class="state" maxlength="2"></form:input></div>
					
				<div class="right">
						<label>Destination Zip</label> <form:input path="destZip" required="true"></form:input></div>
				
			</div>
			
			<div><button class="btn" type="submit">Submit Delivery</button></div>
		
		
		</form:form>
	</section>


	<!-- ====== FOOTER Section ====== -->

	<%@ include file="footer.jsp"%>

	<!-- ====== End FOOTER Section ====== -->

	<!-- jQuery -->

	<%@ include file="jquery.jsp"%>

</body>
</html>