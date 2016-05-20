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
		<h1>INSURANCE</h1>
		<form:form  action="addInsurance">
			<form:errors path="*" cssClass="errorblock" element="div"></form:errors>
		
			<div>
				<input class="btn" type="button" value="${carrier.name}">
			</div>
			<div>
				<label>Current Cost: </label> <label>${cost}</label>
			</div>
			<div>
				<label>Priority: </label> <label>${po.priority}</label>
			</div>
			
			<c:forEach items="${insOptions}" var="insurance">
				<input type="radio" name="options" value="${insurance.description}">${insurance.description}
			</c:forEach>
				<input checked="checked" type="radio" name="options" value="">Decline Insurance
		
			<input class="btn" type="submit" value="Add Insurance Option">
		</form:form>
	</section>


	<!-- ====== FOOTER Section ====== -->

	<%@ include file="footer.jsp"%>

	<!-- ====== End FOOTER Section ====== -->

	<!-- jQuery -->

	<%@ include file="jquery.jsp"%>

</body>
</html>