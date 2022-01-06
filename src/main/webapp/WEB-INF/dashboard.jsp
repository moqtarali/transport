<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <style>
        body{
            background-image: url(https://media.istockphoto.com/photos/transportation-modes-air-shipping-and-truck-picture-id855466918);
        }
        div{
          
            width: 100%;
            height: 700px;
        }
        
    </style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Success Form</title>

</head>

<body>


<div>
 
 <button>Home</button><hr><form:form action="showCommodity" name="submitForm" method="POST"><input type="submit" name="AddCommodity" value="Add Commodity"/></form:form>
</div>



</body>

</html>