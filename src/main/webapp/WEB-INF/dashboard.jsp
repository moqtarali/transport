<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Success Form</title>

</head>

<body>

<font color="green"><h2>Hello</h2></font>

<h3>${msg}</h3> You have successfully logged in.
<form:form action="showCommodity" name="submitForm" method="POST"><input type="submit" name="AddCommodity" value="Add Commodity"/></form:form>




</body>

</html>