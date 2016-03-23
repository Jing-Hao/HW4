
package dbHelper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employees;


public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    
    private Employees employee = new Employees();
    private int employeeID;
    
    public ReadRecord (int employeeID){
    
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.employeeID = employeeID;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

        

    }

    public void doRead() {
        
        try {
            //set up a string to hold our query
            String query ="SELECT * FROM employee WHERE employeeID = ?";
            
            //create a preparedstatement using our query string
            PreparedStatement ps = conn.prepareStatement(query);
            
            //fill in the preparedstatement
            ps.setInt(1,employeeID);
            
            //execute the query
            this.results = ps.executeQuery();
            
            this.results.next();
            
            employee.setEmployeeID(this.results.getInt("employeeID"));
            employee.setFirstName (this.results.getString("firstName"));
            employee.setLastName(this.results.getString("lastName"));
            employee.setEmail(this.results.getString("email"));
            employee.setOfficeLocation(this.results.getString("officeLocation"));
            employee.setPhone(this.results.getString("phone"));
            employee.setYearsOfExperience(this.results.getInt("yearsOfExperience"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    
    public Employees getEmployee(){
        
    
        return this.employee;
    }
    
}
    

