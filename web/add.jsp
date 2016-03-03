<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Employee</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <h1 id="addheader">Add A New Employee</h1>
        
    <form name="addForm" action="addEmployee" method="get">
        
        <div id="add">
        
        <label class="label">First Name:</label>
        <input class="input" type="text" name="firstname" value="" />
        <br>
        <label class="label">Last Name:</label>
        <input class="input" type="text" name="lastname" value="" />
        <br>
        <label class="label">Email:</label>
        <input class="input" type="text" name="email" value="" />
        <br>
        <label class="label">Office Location:</label>
        <input class="input" type="text" name="officelocation" value="" />
        <br>
        <label class="label">Phone:</label>
        <input class="input" type="text" name="Phone" value="" />
        <br>
        <label class="label">Years of Experience:</label>
        <input class="input" type="text" name="yearsofexperience" value="" />
        <br>
        
        </div>
        
        <div id="botton">
        <input type="reset" name="clear" value="Clear"/>
        <input type="submit" name="submit" value="Submit"/>
        </div>
        
    </form>    
    </body>
</html>
