<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Employee</title>
        <link rel="stylesheet" type="text/css" href="css/stylesheet.css" media="screen">
    </head>

    <body>
        <div class="wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>

            <div class="main">

                <h1 id="addheader">Add A New Employee</h1>

                <div id="addForm">
                    <form name="addForm" action="addEmployee" method="get">

                        <table id="inputTable" align="center">
                            <tbody>
                                <tr class="input">
                                    <td class="input">First Name:</td>
                                    <td><input type="text" name="firstname" value="" required></td>
                                </tr>
                                <tr class="input">
                                    <td class="input">Last Name:</td>
                                    <td><input type="text" name="lastname" value="" required></td>
                                </tr>
                                <tr class="input">
                                    <td class="input">Email:</td>
                                    <td><input type="text" name="email" value=""></td>
                                </tr>
                                <tr class="input">
                                    <td class="input">Office Location:</td>
                                    <td><input type="text" name="officelocation" value=""></td>
                                </tr>   
                                <tr class="input">
                                    <td class="input">Phone:</td>
                                    <td><input type="text" name="phone" value=""></td>
                                </tr>   
                                <tr class="input">
                                    <td class="input">Years of Experience:</td>
                                    <td><input type="text" name="yearsofexperience" value=""></td>
                                </tr>  
                            </tbody>
                        </table>

                        <div id="botton">
                            <input type="reset" name="clear" value="Clear"/>
                            <input type="submit" name="submit" value="Submit"/>
                        </div>

                    </form> 
                </div>

            </div><!--close the main div-->

            <%@ include file="includes/footer.jsp" %>

        </div><!--close the wrap div-->  

    </body>
</html>
