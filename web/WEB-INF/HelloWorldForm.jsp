<%-- 
    Document   : HelloWorldForm
    Created on : Jan 27, 2023, 1:31:46 PM
    Author     : Jaz Baliola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="hello" method="POST">
            <label for="firstName">First Name: </label>
            <input id="firstName" type="text" name="firstName" placeholder="Enter firstname" value="${firstName}" /><br>
            
            <label for="lastName">Last Name: </label>
            <input id="lastName" type="text" name="lastName" placeholder="Enter lastname" value="${lastName}" /><br>
            
            <input type="submit" name="Submit">
        </form>
    </body>
</html>
