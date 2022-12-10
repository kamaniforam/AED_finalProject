/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employee;

import MainApplication.Ecosystem;
import java.util.ArrayList;
import model.Role.SysAdmin;
import model.User;

/**
 *
 * @author richajain
 */
public class EmployeeCatalog {
    
    private ArrayList<Employee> employeeCatalog;

    public EmployeeCatalog() {
        employeeCatalog = new ArrayList();
    }
    
    public ArrayList<Employee> getEmployeeCatalog() 
    {
        return employeeCatalog;
    }
    
    public Employee addEmployee(String empName)
    {
        Employee employee = new Employee();
        employee.setEmployeeName(empName);
        employeeCatalog.add(employee);
        return employee;
    } 
    
}
