/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employee;

/**
 *
 * @author richajain
 */
public class Employee {
    
    private String employeeName;
    private int empId;
    private static int count = 1;

    public Employee() 
    {
        empId = count;
        count++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return employeeName; //To change body of generated methods, choose Tools | Templates.
    }
    
}
