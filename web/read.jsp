<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="styleread.css" media="screen">
    </head>
    
    <% String table = (String) request.getAttribute("table"); %> 
    
    <body>
        <h1 id="readheader">Employee Information</h1>
        
        <div id="readtable">
        <%= table%>
        
       
        </div>
        
        <a href ="add"><p style="text-align:center">Add A New Employee</p></a>
        
        <br> <br>
        
        <a href="search.jsp"><p style="text-align: center">Search Employees</p></a>
        
    </body>

