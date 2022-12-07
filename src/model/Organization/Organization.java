/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import java.util.UUID;
import model.Employee.EmployeeCatalog;
import model.Role.Role;
import model.UserCatalog;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author richajain
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private String organizationID;
    private UserCatalog userCatalog;
    private EmployeeCatalog employeeCatalog;
//    private static int counter=0;

    public UserCatalog getUserCatalog() {
        return userCatalog;
    }

    public void setUserCatalog(UserCatalog userCatalog) {
        this.userCatalog = userCatalog;
    }
    
    public enum Type{
        Surgery("Surgery Organisation"),
        FrontDesk("Front Desk");
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

    } 

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        organizationID = UUID.randomUUID().toString();
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public String getOrganizationID() {
        return organizationID;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public EmployeeCatalog getEmployeeCatalog() {
        return employeeCatalog;
    }
    

    @Override
    public String toString() {
        return name;
    }
}
