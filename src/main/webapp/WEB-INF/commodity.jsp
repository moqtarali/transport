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
        <form:form action="savecommodity" method="post" modelAttribute= "commodityBean">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Book Cargos</h2></td>
                </tr>
                 <tr>
                    <td>CommodityDetailes:</td>
                    <td><form:input path="CommodityDetailes" /></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="Name" /></td>
                </tr>
                <tr>
                    <td>DateOfShipping:</td>
                    <td><form:input path="DateOfShipping" /></td>
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
                    <td>EstimatedAmount:</td>
                    <td><form:input path="EstimatedAmount" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="savecommodity" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>