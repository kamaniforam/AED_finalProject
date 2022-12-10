/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.model.PHC;

import java.util.ArrayList;

/**
 *
 * @author foram
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeelist;

    public EmployeeDirectory() {
        employeelist = new ArrayList();
    }

    public ArrayList<Employee> getEmployeelist() {
        return employeelist;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeelist.add(employee);
        return employee;
    }
}