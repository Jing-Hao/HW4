<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    
    <% String table = (String) request.getAttribute("table"); %> 
    
    <body>
        <h1>Employee Information</h1>
        <div id = "readtable">
        <%= table%>
        
        <br><br>
        </div>
        
        <a href ="add">Add A New Employee</a>
        
    </body>

