/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Employee.Employee;
import model.Role.Role;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author richajain
 */
public class User {
    
   private String username;
    private String password;
    private Employee employee;
    private Patient patient;
    private DonorData donor;
    private Role role;
    private WorkQueue workQueue;
    private int loginAttempt = 0;

    public int getLoginattempt() {
        return loginAttempt;
    }

    public void setLoginattempt(int loginAttempt) {
        //incrementing the login attempt count
        this.loginAttempt += loginAttempt;
    }

    public void resetLogin() {
        loginAttempt = 0;

    }

    public User() {
        workQueue = new WorkQueue();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DonorData getDonor() {
        return donor;
    }

    public void setDonor(DonorData donor) {
        this.donor = donor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return username;
    }
}
