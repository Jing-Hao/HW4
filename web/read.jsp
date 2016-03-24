<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="css/stylesheet.css" media="screen">
</head>

<% String table = (String) request.getAttribute("table");%> 

<body>
    <div class="wrap">

        <%@ include file="includes/header.jsp" %>

        <%@ include file="includes/menu.jsp" %>

        <div class="main">


            <h1 id="readheader">Employee Information</h1>

            <div id="readtable">
                <%= table%>


            </div>

        </div><!--close the main div-->

        <%@ include file="includes/footer.jsp" %>

    </div><!--close the wrap div-->   
</body>

