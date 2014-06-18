<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Role Page</title>
</head>
<body>
	Language: <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
	<h1>Add Users Role</h1>

	<form:form commandName="role">
		<table>
			<tr>	
				<td><spring:message code="goal.text"/></td>
				<td><form:input path="roles" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enter User" /></td>
			</tr>
		</table>
	</form:form>
	<h1>Usuario ${user.name}</h1>
</body>
</html>