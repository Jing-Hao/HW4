<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %> 
    
    <body>
        <h1>Employee Information</h1>
        <%= table%>
        
        <br><br>
        
        <a href ="add">Add A New Employee</a>
        
    </body>

