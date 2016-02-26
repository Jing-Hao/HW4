
package model;

public class Employees {
    
   private int EmployeeID;
   private String FirstName;
   private String LastName;
   private String Email;
   private String OfficeLocation;
   private String Phone;
   private int YearsOfExperience;
   
    public Employees() {
        this.EmployeeID = 0;
        this.FirstName = "";
        this.LastName = "";
        this.Email = "";
        this.OfficeLocation = "";
        this.Phone = "";
        this.YearsOfExperience = 0;
    }

    public Employees(int EmployeeID, String FirstName, String LastName, String Email, String OfficeLocation, String Phone, int YearsOfExperience) {
        this.EmployeeID = EmployeeID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.OfficeLocation = OfficeLocation;
        this.Phone = Phone;
        this.YearsOfExperience = YearsOfExperience;
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

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(int YearsOfExperience) {
        this.YearsOfExperience = YearsOfExperience;
    }

    @Override
    public String toString() {
        return "Employees{" + "EmployeeID=" + EmployeeID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", OfficeLocation=" + OfficeLocation + ", Phone=" + Phone + ", YearsOfExperience=" + YearsOfExperience + '}';
    }
    





    
   
   
}
