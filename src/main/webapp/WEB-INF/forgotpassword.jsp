 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-beta/css/bootstrap.min.css' rel='stylesheet' type='text/css'>
    <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
<style>
    body{
       background-image: url(https://media.istockphoto.com/photos/transportation-modes-air-shipping-and-truck-picture-id855466918);
    }

    .forgotpassword-box {
            margin-top: 75px;
            height: 450px;
          
            text-align: center;
            box-shadow: 0 3px 6px rgba(0, 0, 0, 0.16), 0 3px 6px rgba(0, 0, 0, 0.23);
        }
        .forgotpassword-title {
            margin-top: 15px;
            text-align: center;
            font-size: 25px;
            letter-spacing: 2px;
            margin-top: 15px;
            font-weight: bold;
            color: black;
        }
         
        .forgotpassword-form {
            margin-top: 35px;
            text-align: left;
        }
    input[type=password] {
            background-color: white;
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
        .form-group {
            margin-bottom: 40px;
            outline: 0px;
        }
         
        .form-control:focus {
            border-color: inherit;
            -webkit-box-shadow: none;
            box-shadow: none;
            border-bottom: 2px solid #0DB8DE;
            outline: 0;
            background-color: #1A2226;
            color: #ECF0F5;
        }
         
        input:focus {
            outline: none;
            box-shadow: 0 0 0;
        }
         
        label {
            margin-bottom: 0px;
        }
         
        .form-control-label {
            font-size: 10px;
            color: red;
            font-weight: bold;
            letter-spacing: 1px;
        } 
        .btn-outline-primary {
            border-color: blue;
            color:blue;
            border-radius: 0px;
            font-weight: bold;
            letter-spacing: 1px;
        }
        .btn-outline-primary:hover {
            background-color: burlywood;
            right: 0px;
            left: 0px;   
        }
        .forgotpassword-btm {
            float: right;
        }
        
           .forgotpassword-button {
            padding-right: 0px;
            margin-right: 25px;
            text-align: right;
            font-size: 30px;
            letter-spacing: 2px;
            margin-right: 15px;
           
        }   
        
        
        .forgotpassword-text {
            text-align: center;
            padding-left: 0px;
            color: #1A2226;
        }
        .forgotpasswordbttm {
            padding: 0px;
        }
        
       
</style>
</head>
<body>
    <div align="center">
        <form:form action="newPassword" method="post" modelAttribute="passwordBean">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-2"></div>
                    <div class="col-lg-6 col-md-8 forgotpassword-box">
                        
                        <div>
                        <div class="col-lg-12 forgotpassword-title">
                            Forgot-password
                        </div>
                        <div class="col-lg-12 forgotpassword-form">
                            <div class="col-lg-12 forgotpassword-form"><hr>
                                <div class="form-group">
                                    <label class="form-control-label">OldPassword</label>
                                    <form:input type= "password" path = "oldPassword" class= "form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label class="form-control-label">NewPassword</label>
                                        <form:input type= "password" path = "newPassword" class= "form-control" />
                                        </div>
                                        <div class="form-group">
                                            <label class="form-control-label">ConfirmPassword</label>
                                            <form:input type= "password" path = "conformPassword" class= "form-control" />
                                            </div>
                                            <div><button type="submit" name="newPassword"  value="newPassword" class="btn btn-outline-primary">Forgotpassword</button>
                                            </div>
                                            
                                 </div>
                            </div>
                     </div>
                 </div>
                    <div class="col-lg-3 col-md-2"></div>
                </div>
            </div>
        </div>
     
        </form:form>
            </div>
    </body>
</html>