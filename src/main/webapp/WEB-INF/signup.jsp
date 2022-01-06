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
<style>
    body{
        background-color: aqua;
    }
    .signup-box {
            margin-top: 75px;
            height: 760px;
            background: wheat;
            text-align: center;
            box-shadow: 0 3px 6px rgba(0, 0, 0, 0.16), 0 3px 6px rgba(0, 0, 0, 0.23);
        }
        .signup-title {
            margin-top: 15px;
            text-align: center;
            font-size: 25px;
            letter-spacing: 2px;
            margin-top: 15px;
            font-weight: bold;
            color: blue;
        }
         
        .signup-form {
            margin-top: 35px;
            text-align: left;
        }
             
    input[type=text] {
            background-color: white;
            border: none;
            border-bottom: 2px solid #0DB8DE;
            border-top: 0px;
            border-radius: 0px;
            font-weight: bold;
            outline: 0;
            margin-bottom: 20px;
            padding-left: 0px;
            color: black;
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
            color: black;
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
        .signup-btm {
            float: right;
        }
        
           .signup-button {
            padding-right: 0px;
            margin-right: 25px;
            text-align: right;
            font-size: 30px;
            letter-spacing: 2px;
            margin-right: 15px;
           
        }   
        
        
        .signup-text {
            text-align: center;
            padding-left: 0px;
            color: #1A2226;
        }
        .signupbttm {
            padding: 0px;
        }
       
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
        <form:form action="register" method="post" modelAttribute="signupBean">
            
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-md-2"></div>
                        <div class="col-lg-6 col-md-8 signup-box">
                            
                            <div>
                            <div class="col-lg-12 signup-title">
                                Form- Registration
                            </div>
                            <div class="col-lg-12 signup-form">
                                <div class="col-lg-12 signup-form"><hr>
                                            <div class="signup-group">
                                             <label class="form-control-label">fullName:<span style="color: red;">*</span></label>
                                             <form:input type="text" path = "fullName" class="form-control" />
                                            </div>
                                            <div class="signup-group">
                                                <label class="form-control-label">MiddleName:<span style="color: red;">*</span></label>
                                                <form:input type="text" path = "MiddleName" class="form-control" />
                                            </div>
                                            <div class="signup-group">
                                                <label class="form-control-label">LastName:<span style="color: red;">*</span></label>
                                                <form:input type="text" path = "lastName" class="form-control" />
                                            </div>
                                            <div class="signup-group">
                                                <label class="form-control-label">UserName:<span style="color: red;">*</span></label>
                                                <form:input type="text" path = "userName" class="form-control" />
                                            </div>
                                            <div class="signup-group">
                                                <label class="form-control-label">Password:<span style="color: red;">*</span></label>
                                                <form:input type="password" path = "password" class="form-control" />
                                            </div>
                                            <div class="signup-group">
                                                <label class="form-control-label">E-mail:<span style="color: red;">*</span></label>
                                                <form:input type="text" path = "email" class="form-control" />
                                            </div>
                                            <div class="signup-group">
                                                <label class="form-control-label">Address:</label>
                                                <form:input type="text" path = "address" class="form-control" />
                                            </div>
                                            <div class="signup-group">
                                                <label class="form-control-label">Mobile-Number:<span style="color: red;">*</span></label>
                                                <form:input type="text" path = "mobileNumber" class="form-control" />
                                            </div>
                                            <button type="submit" name ="signup" value ="register" class="btn btn-outline-primary">Signup</button>
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
