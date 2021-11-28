<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Success</title>
</head>
<body>
    <div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Signup!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>Thank you for registering! Here's the review of your details:</h3>
                </td>
            </tr>
	    <tr>
                <td>FullName:</td>
                <td>${userForm.fullname}</td>
            </tr>
	     <tr>
                <td>LastName:</td>
                <td>${userForm.lastname}</td>
            </tr>
            <tr>
                <td>UserName:</td>
                <td>${userForm.username}</td>
            </tr>
	     <tr>
                <td>Password:</td>
                <td>${userForm.username}</td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td>${userForm.email}</td>
            </tr>
            <tr>
                <td>DOB:</td>
                <td>${userForm.birthDate}</td>
            </tr>
            <tr>
                <td>Address:</td>
                <td>${userForm.address}</td>
            </tr>
	    <tr>
                <td>MobileNumber:</td>
                <td>${userForm.mobilenumber}</td>
            </tr>
 
        </table>
    </div>
</body>
</html>