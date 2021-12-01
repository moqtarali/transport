<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
div{
align = "center";

}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>
</head>
<body>

<form:form action="login" name="submitForm" method="POST" modelAttribute="loginBean">


<div align="center">
<table>
<tr>
<td>User Name</td>
<td><form:input type="text" path="userName" /></td>
</tr>
<tr>
<td>Password</td>
<td><form:input type="password" path="password" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" name="submit" value="Submit" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" name="signup" value="Signup" /></td>
</tr>
</table>
<div style="color: red">${error}</div>

</div>

</form:form>

</body>
</html>