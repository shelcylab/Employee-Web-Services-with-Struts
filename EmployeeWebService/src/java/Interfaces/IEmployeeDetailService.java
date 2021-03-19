/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Models.Employee;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author shelc
 */
@WebService
public interface IEmployeeDetailService {

    @WebMethod(operationName = "GetEmployeeDetails")
    @WebResult(name = "EmployeeData")
    public List<Employee> GetEmployeeDetails();
}
