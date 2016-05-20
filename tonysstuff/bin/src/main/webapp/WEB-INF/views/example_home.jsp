<%@ page session="false" %>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
		<h1>Hello World!</h1>
		<p>The time on the server is ${serverTime}.</p>
		<p>Please select one of the following options:</p>
		<ul>
			<li><a href="invokeController.do">Invoke controller</a></li>
			<li><a href="loggingMappingExceptionResolver.do">Force an unchecked exception that is handled using a LoggingMappingExceptionResolver</a></li>
			<li><a href="exceptionHandlerAnnotation.do">Force an unchecked exception that is handled using an @ExceptionHandler annotation</a></li>
		</ul>
	</body>
</html>
