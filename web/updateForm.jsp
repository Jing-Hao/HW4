<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="model.Employees"%>
<% Employees employee = (Employees) request.getAttribute("employee"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styleadd.css" media="screen">
        <title>Update An Employee</title>
    </head>
    <body>
        <h1 id="updateheader">Update An Employee Record</h1>
        
        <div id="updateForm">
        <form name="updateForm" action="updateEmployee" method="get">
  
            <table id="inputTable" align="center">
                <tbody>
                    <tr>
                        <td>Employee ID:</td>
                        <td><input type="text" name="employeeID" value="<%= employee.getEmployeeID() %>" readonly /></td>
                    </tr>
                    <tr>
                        <td>First Name:</td>
                        <td><input type="text" name="firstname" value="<%= employee.getFirstName() %>" /></td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td><input type="text" name="lastname" value="<%= employee.getLastName() %>" /></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email" value="<%= employee.getEmail() %>" /></td>
                    </tr>
                    <tr>
                        <td>Office Location:</td>
                        <td><input type="text" name="officelocation" value="<%= employee.getOfficeLocation() %>" /></td>
                    </tr>   
                    <tr>
                        <td>Phone:</td>
                        <td><input type="text" name="phone" value="<%= employee.getPhone() %>" /></td>
                    </tr>   
                    <tr>
                        <td>Years of Experience:</td>
                        <td><input type="text" name="yearsofexperience" value="<%= employee.getYearsOfExperience() %>" /></td>
                    </tr>  
                </tbody>
            </table>

                <div id="botton">
                    <input type="reset" name="clear" value="Clear"/>
                    <input type="submit" name="submit" value="Update"/>
                </div>
        
        </form> 
        </div>
    </body>
</html>
