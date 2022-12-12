/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.model.PHC;

import Business.Roles.Role;
import Business.WorkQueue.WorkQueue;
/**
 *
 * @author foram
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    } 
    
    public UserAccount(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
//    @Override
//    public String toString() {
//        String roleStr = role != null ? role.toString() : null;
//        return String.format("%s/%s/%s", username, password, roleStr);
//    }

    public boolean equals(UserAccount user) {
        return this.username.equals(user.username) && 
                this.password.equals(user.password) && 
                this.role.equals(user.role);
    }
}