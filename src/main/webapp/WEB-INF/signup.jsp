
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
fieldset{


</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
        <form:form action="register" method="post" modelAttribute="signupBean">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Form- Registration</h2></td>
                </tr>
		 <tr>
                    <td>fullName:</td>
                    <td><form:input path="fullName" /></td>
                </tr><br>
		 <tr>		
                    <td>LastName:</td><br>
                    <td><form:input path="lastName" /></td><br>
                </tr><br>

                <tr>
                    <td>UserName:</td><br>
                    <td><form:input path="userName" /></td>
                </tr><br>
                <tr>
                    <td>Password:</td>
                    <td><form:password path="password" /></td>
                </tr><br>
                <tr>
                    <td>E-mail:</td>
                    <td><form:input path="email" /></td>
                </tr><br>
                <tr>
                    <td>DOB:</td>
                    <td><form:input path="dOB" /></td>
                </tr><br>
                <tr>
                    <td>Address:</td>
                    <td><form:input path="address" /></td>
                </tr><br>
		 <tr>
                    <td>MobileNumber:</td>
                    <td><form:input path="mobileNumber" /></td>
                </tr><br>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
 