<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Employee</title>
    </head>
    <body>
        <h1>Add A New Employee</h1>
        
    <form name="addForm" action="addEmployee" method="get">
        
        <label>First Name:</label>
        <input type="text" name="firstname" value="" />
        <br>
        <label>Last Name:</label>
        <input type="text" name="lastname" value="" />
        <br>
        <label>Email:</label>
        <input type="text" name="email" value="" />
        <br>
        <label>Office Location:</label>
        <input type="text" name="officelocation" value="" />
        <br>
        <label>Phone:</label>
        <input type="text" name="Phone" value="" />
        <br>
        <label>Years of Experience:</label>
        <input type="text" name="yearsofexperience" value="" />
        <br>
        <input type="reset" name="clear" value="Clear"/>
        <input type="submit" name="submit" value="Submit"/>
        
    </form>    
    </body>
</html>
