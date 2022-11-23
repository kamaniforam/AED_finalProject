/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author foram
 */
public class UserDetails {
    
    public static enum Roles {
        SYSTEM_ADMINISTRATOR, PATIENT, DOCTOR,COMMUNITY_ADMINISTRATOR,HOSPITAL_ADMINISTRATOR;
        
        public static Roles fromString(String str) {
            return Roles.valueOf(str.replaceAll(" ", "_").toUpperCase());
        }
    }
    
    private String userName;
    private String password;
    private Roles role;
    
    public UserDetails(String userName, String password, Roles role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
    
    public boolean validateCreds(String username, String password, Roles role) {
        return username.equals(getUserName()) && password.equals(password) && role == getRole();
    }
    
}
