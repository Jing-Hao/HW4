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

public class SearchQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public SearchQuery(){
        
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doSearch (String firstName){
        
        try {
            String query = "SELECT * FROM employee WHERE UPPER(firstName) LIKE ?";
            
            PreparedStatement ps = conn.prepareStatement (query);
            ps.setString(1, "%" + firstName.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getHTMLtable() {

        String table = "";

        table += "<table>";
   
                table += "<tr>";

                table += "<th>";
                table += "Employee ID";
                table += "</th>";

                table += "<th>";
                table += "First Name";
                table += "</th>";

                table += "<th>";
                table += "Last Name";
                table += "</th>";

                table += "<th>";
                table += "Email";
                table += "</th>";

                table += "<th>";
                table += "Office Location";
                table += "</th>";

                table += "<th>";
                table += "Phone";
                table += "</th>";

                table += "<th>";
                table += "Years Of Experience";
                table += "</th>";
                
                table += "<th>";
                table += "";
                table += "</th>";
                
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
                table += "<a href=update?employeeID=" + employee.getEmployeeID() + "> Update </a>" + "<a href=delete?employeeID=" + employee.getEmployeeID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";

            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        table += "</table>";

        return table;

    }
    
}
