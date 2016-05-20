<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<title>Application Error</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${!empty errorMessage}">
				<p><c:out value="${errorMessage}" /></p>
			</c:when>
			<c:otherwise>
				<p>An application error has occurred and was handled by the Logging Mapping Exception Resolver.</p>
			</c:otherwise>
		</c:choose>
		<p><a href="example.do">Go home</a></p>
	</body>
</html>