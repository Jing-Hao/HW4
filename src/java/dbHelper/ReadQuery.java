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

public class ReadQuery {

    private Connection conn;
    private ResultSet results;

    public ReadQuery() {

        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void doRead() {

        try {
            String query = "Select * from employee";

            PreparedStatement ps = conn.prepareStatement(query);

            this.results = ps.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getHTMLtable() {

        String table = "";

        table += "<table border=1>";
   
                table += "<tr>";

                table += "<td>";
                table += "Employee ID";
                table += "</td>";

                table += "<td>";
                table += "First Name";
                table += "</td>";

                table += "<td>";
                table += "Last Name";
                table += "</td>";

                table += "<td>";
                table += "Email";
                table += "</td>";

                table += "<td>";
                table += "Office Location";
                table += "</td>";

                table += "<td>";
                table += "Phone";
                table += "</td>";

                table += "<td>";
                table += "Years Of Experience";
                table += "</td>";
                
                table += "</tr>";
        
        
        try {
            while (this.results.next()) {

                Employees employee = new Employees();
                employee.setEmployeeID(this.results.getInt("employeeID"));
                employee.setFirstName(this.results.getString("firstName"));
                employee.setLastName(this.results.getString("lastName"));
                employee.setEmail(this.results.getString("email"));
                employee.setOfficeLocation(this.results.getString("officeLocation"));
                employee.setPhone(this.results.getString("phone"));
                employee.setYearsOfExperience(this.results.getInt("yearsOfExperience"));
                
                table += "<tr>";

                table += "<td>";
                table += employee.getEmployeeID();
                table += "</td>";

                table += "<td>";
                table += employee.getFirstName();
                table += "</td>";

                table += "<td>";
                table += employee.getLastName();
                table += "</td>";

                table += "<td>";
                table += employee.getEmail();
                table += "</td>";

                table += "<td>";
                table += employee.getOfficeLocation();
                table += "</td>";

                table += "<td>";
                table += employee.getPhone();
                table += "</td>";

                table += "<td>";
                table += employee.getYearsOfExperience();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=delete?employeeID=" + employee.getEmployeeID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";

            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        table += "</table>";

        return table;

    }
}
