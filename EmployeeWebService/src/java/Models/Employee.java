package Models;

/**
 *
 * @author shelc
 */
public class Employee {

    private String ID;
    private String Name;
    private String Email;
    private double Salary;

    public Employee(String ID, String Name, String Email, double Salary) {
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;
        this.Salary = Salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

}
