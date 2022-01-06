<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-beta/css/bootstrap.min.css' rel='stylesheet' type='text/css'>
    <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
    <style>
        body {
            background-image: url(https://media.istockphoto.com/photos/transport-global-business-picture-id639465566);
            font-family: 'Roboto', sans-serif;
        }
         
        .login-box {
            margin-top: 75px;
            height: auto;
     
            text-align: center;
            box-shadow: 0 3px 6px rgba(0, 0, 0, 0.16), 0 3px 6px rgba(0, 0, 0, 0.23);
        }
        
         
        .login-title {
            margin-top: 15px;
            text-align: center;
            font-size: 30px;
            letter-spacing: 2px;
            margin-top: 15px;
            font-weight: bold;
            color: black;
        }
         
        .login-form {
            margin-top: 25px;
            text-align: left;
        }
         
        input[type=text] {
            background-color:  white;
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
            border-color: black;
            color: red;
            border-radius: 0px;
            font-weight: bold;
            letter-spacing: 1px;
        }
        .btn-outline-primary:hover {
            background-color: burlywood;
            right: 0px;
            left: 0px;   
        }
        .login-btm {
            float: right;
        }
        
           .login-button {
            padding-right: 0px;
            margin-right: 25px;
            text-align: right;
            font-size: 30px;
            letter-spacing: 2px;
            margin-right: 15px;
           
        }   
        
        
        .login-text {
            text-align: center;
            padding-left: 0px;
            color: #1A2226;
        }
        .loginbttm {
            padding: 0px;
        }
        
        </style>
 </head>
 <body>
   <form:form action="login" name="submitForm" method="POST" modelAttribute="loginBean">
    
        <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-2"></div>
                    <div class="col-lg-6 col-md-8 login-box">
                        
                        <div>
                        <div class="col-lg-12 login-title">
                             Login
                        </div>
                        <div class="col-lg-12 login-form">
                            <div class="col-lg-12 login-form">
                                        <div class="form-group">
                                        <label class="form-control-label">UserName</label>
                                        <form:input type="text" path = "userName" class="form-control" />
                                        </div>
                                        <div class="form-group">
                                        <label class="form-control-label">Password</label>
                                        <form:input type= "password" path = "password" class= "form-control" />
                                        </div>
         
                                        <div class="col-lg-12 loginbttm">
                                                <div class="col-lg-6 login-btm login-text">
                                                 <!-- Error Message -->
                                                </div>
                                                
                                                <div class="col-lg-6 login-btm login-button">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                    
                                                        
                                                 <button type="submit" name ="submit" value="Submit" class="btn btn-outline-primary">LOGIN</button>
                                                 <hr>
                                                 <button type="submit" name ="signup" value ="Signup" class="btn btn-outline-primary">Signup</button> 
                                                 <hr>  
                                                 <button type="submit" name="newPassword"  value="newPassword" class="btn btn-outline-primary">Forgotpassword</button><hr>
                                                </div>
                                                </div>
                                                </div>
                                                 <div style="color: red">${error}</div>
                                       
                                                </div>
                                            </div>
                                        </div>
 
                                    </div>
                                </div>
                            <div class="col-lg-3 col-md-2"></div>
                        </div>
                    </div>
                </div>
            </div>
        </form:form>
 </body>
 </html>