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
		<h1>COMPLETED</h1>
		<form:form action="confirm">
			<form:errors path="*" cssClass="errorblock" element="div"></form:errors>

			<div>
				<input class="btn" type="button" value="${po.carrier}">
			</div>
			<div>
				<label>Current Cost: </label> <label>${cost}</label>
			</div>
			<div>
				<label>Weight: </label> <label>${po.weight}</label>
			</div>
			<div>
				<label>Status: </label><label>${confirm.status}</label>
			</div>
			<div>
				<label>Priority: </label> <label>${po.priority}</label>
			</div>
			<div>
				<label>Tracking number: </label> <label>${confirm.trackingNumber}</label>
			</div>

			<h3>
				<a href="/jits/downloadPDF">Download PDF Reciept</a>
			</h3>
			<input class="btn" type="submit" name="submit" value="Confirm">
			<input class="btn" name="submit" type="submit" value="Reset">
		</form:form>
	</section>


	<!-- ====== FOOTER Section ====== -->

	<%@ include file="footer.jsp"%>

	<!-- ====== End FOOTER Section ====== -->

	<!-- jQuery -->

	<%@ include file="jquery.jsp"%>

</body>
</html>