package Services;

import Models.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author shelc
 */
@WebService(endpointInterface = "Interfaces.IEmployeeDetailService")
public class EmployeeDetailService {


    public List<Employee> GetEmployeeDetails() {
        List<Employee> employee = new ArrayList<>();

        try {
            Connection conn = InitiateDBConnection();
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery("Select * from employeedetails");

            while (rs.next()) {
                employee.add(new Employee(rs.getString("ID"),
                        rs.getString("Name"),
                        rs.getString("Email"),
                        rs.getDouble("Salary")));
            }
            rs.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return employee;
    }

    private Connection InitiateDBConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_URL = "jdbc:mysql://localhost:3306/employeedata?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false";
            String db_username = "root";
            String db_password = "root123";

            conn = DriverManager.getConnection(db_URL, db_username, db_password);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return conn;
    }

}
