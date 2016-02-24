
package model;

public class Employee {
    
   private int EmployeeID;
   private String FirstName;
   private String LastName;
   private String Email;
   private String OfficeLocation;
   private int Phone;
   
    public Employee() {
        this.EmployeeID = 0;
        this.FirstName = "";
        this.LastName = "";
        this.Email = "";
        this.OfficeLocation = "";
        this.Phone = 0;
    }

    public Employee(int EmployeeID, String FirstName, String LastName, String Email, String OfficeLocation, int Phone) {
        this.EmployeeID = EmployeeID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.OfficeLocation = OfficeLocation;
        this.Phone = Phone;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getOfficeLocation() {
        return OfficeLocation;
    }

    public void setOfficeLocation(String OfficeLocation) {
        this.OfficeLocation = OfficeLocation;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return "Employee{" + "EmployeeID=" + EmployeeID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", OfficeLocation=" + OfficeLocation + ", Phone=" + Phone + '}';
    }

    
   
   
}
