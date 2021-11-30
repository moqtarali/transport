<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Booking</title>
</head>
<body>
    <div align="center">
        <form:form action="registerationsucess" method="post" modelAttribute="CommodityBean">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Form for booking Cargos</h2></td>
                </tr>
		 <tr>
                    <td>CarName:</td>
                    <td><form:input path="CarName" /></td>
                </tr>
		 <tr>		
                    <td>RegistrationNumber:</td>
                    <td><form:input path="RegistrationNumber" /></td>
                </tr>

                <tr>
                    <td>SourceAdd:</td>
                    <td><form:input path="SourceAdd" /></td>
                </tr>
                <tr>
                    <td>DestinationAdd:</td>
                    <td><form:password path="DestinationAdd" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="registerationsucess" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
 