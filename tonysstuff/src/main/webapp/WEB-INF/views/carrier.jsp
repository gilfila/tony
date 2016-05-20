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
		<h1>CARRIERS</h1>
		<form:form action="carrier">
			<table class="table">
				<c:forEach items="${carriers}" var="curCarrier">
					<tr>
						<td colspan=2><input class="btn" type="submit" name="submit"
							value="${curCarrier.name}"></td>
					</tr>

					<c:forEach items="${curCarrier.tariffs}" var="tariff">
						<tr>
							<td>${tariff.value.code}</td>
							<td>${tariff.value.duration}</td>
						</tr>
					</c:forEach>
					<tr>
					<td colspan=2></td>
					</tr>
				</c:forEach>
			</table>
		</form:form>

	</section>


	<!-- ====== FOOTER Section ====== -->

	<%@ include file="footer.jsp"%>

	<!-- ====== End FOOTER Section ====== -->

	<!-- jQuery -->

	<%@ include file="jquery.jsp"%>

</body>
</html>