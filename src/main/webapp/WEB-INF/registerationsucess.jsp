<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Success</title>
<style>
     body{
        background-color:lightgreen;
    }
             
    input[type=text] {
            background-color: black;
            border: none;
            border-bottom: 2px solid #0DB8DE;
            border-top: 0px;
            border-radius: 0px;
            font-weight: bold;
            outline: 0;
            margin-bottom: 20px;
            padding-left: 0px;
            color: #ECF0F5;
        }
         
        input[type=password] {
            background-color: black;
            border: none;
            border-bottom: 2px solid #0DB8DE;
            border-top: 0px;
            border-radius: 0px;
            font-weight: bold;
            outline: 0;
            padding-left: 0px;
            margin-bottom: 20px;
            color: #ECF0F5;
        }
        div{
            border-radius: 600px;
        }
</style>
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
                <td>${userDetailes.fullName}</td>
            </tr>
            <tr>
                <td>MiddleName:</td>
                <td>${userDetailes.middleName}</td>
            </tr>
	        <tr>
                <td>LastName:</td>
                <td>${userDetailes.lastName}</td>
            </tr>
            <tr>
                <td>UserName:</td>
                <td>${userDetailes.userName}</td>
            </tr>
            <tr>
                <td>Password:</td>
                <td>${userDetailes.password}</td>
            </tr>
	     
            <tr>
                <td>E-mail:</td>
                <td>${userDetailes.email}</td>
            </tr>       
            <tr>
                <td>Address:</td>
                <td>${userDetailes.address}</td>
            </tr>
	        <tr>
                <td>MobileNumber:</td>
                <td>${userDetailes.mobileNumber}</td>
            </tr> 
            
        </table>
       
    </div>
    
</body>
</html>