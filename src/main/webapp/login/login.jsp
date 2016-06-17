<!doctype html>
<html>
<head>
<title>Login</title>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


</head>
<body>
	<form name="form_login" action="/login" method="POST">
		<table>
			<tr>
				<td>User:</td>
				<td><input type="text" name="username" value=""></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value=""></td>
			</tr>
			<tr>
				<td><input type="hidden"                        
        			name="${_csrf.parameterName}"
        			value="${_csrf.token}"/></td>
				<td><input name="submit" type="submit" value="submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>