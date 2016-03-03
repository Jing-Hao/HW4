<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Employee</title>
        <link rel="stylesheet" type="text/css" href="styleadd.css" media="screen">
    </head>
   
    <body>
        <h1 id="addheader">Add A New Employee</h1>
        
        <div id="addForm">
        <form name="addForm" action="addEmployee" method="get">
  
            <table id="inputTable" align="center">
                <tbody>
                    <tr>
                        <td>First Name:</td>
                        <td><input type="text" name="firstname" value="" required></td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td><input type="text" name="lastname" value="" required></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email" value=""></td>
                    </tr>
                    <tr>
                        <td>Office Location:</td>
                        <td><input type="text" name="phone" value=""></td>
                    </tr>    
                    <tr>
                        <td>Years of Experience:</td>
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
    </body>
</html>
