/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import model.Employee.Employee;
import model.Role.Role;

/**
 *
 * @author richajain
 */
public class UserCatalog {
    
     private ArrayList<User> userCatalog;

    public UserCatalog() {
        this.userCatalog = new ArrayList();
    }

    public ArrayList<User> getUserCatalog() {
        return userCatalog;
    }

    //To create new user account
    public User newUserAccount(String username, String password, Employee employee, Role role) {
        User ua = new User();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setEmployee(employee);
        ua.setRole(role);
        userCatalog.add(ua);
        return ua;
    }

    //To create new donor account
    public User newDonorAccount(String username, String password, DonorData donor, Role role) {
        User ua = new User();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setDonor(donor);
        ua.setRole(role);
        userCatalog.add(ua);
        return ua;
    }

    //To create new patient account
    public User newPatientAccount(String username, String password, Patient patient, Role role) {
        User ua = new User();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setPatient(patient);
        ua.setRole(role);
        userCatalog.add(ua);
        return ua;
    }

    //Validate if username is unique
    public boolean ifUniqueUsername(String username) {
        for (User ua : userCatalog) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    //To authenticate user

    public User authenticateUserAccount(String username, String password) {
        List<User> useraccList = userCatalog.stream().filter(acc -> acc.getUsername().equals(username) && acc.getPassword().equals(password))
                .collect(Collectors.toList());
        List<User> useraccList1 = userCatalog.stream().filter(acc -> acc.getUsername().equals(username))
                .collect(Collectors.toList());

        boolean isUsernamePresent = userCatalog.stream().filter(acc -> acc.getUsername().equals(username))
                .collect(Collectors.toList()).size() > 0;
        boolean isSuccess = useraccList.size() > 0;

        if (isSuccess) {
            useraccList.get(0).resetLogin();
            return useraccList.get(0);
        } else if (isUsernamePresent && !isSuccess) {
            useraccList1.get(0).setLoginattempt(1);
            if (useraccList1.get(0).getLoginattempt() > 3) {
                userCatalog.remove(useraccList1.get(0));
                JOptionPane.showMessageDialog(null, "You exceeded maximum number of login attempts. \nYour Account has been removed from DB please create new One!");
            }
            return null;
        }

        return null;

    }

    public boolean isUserNameUnique(String username) {
        List<User> useraccList = userCatalog.stream().filter(acc -> acc.getUsername().equals(username))
                .collect(Collectors.toList());

        return useraccList.size() == 0;
    }

    public void removeUserAccount(String username) {
        for (User ua : userCatalog) {
            if (ua.getUsername().equals(username)) {
                userCatalog.remove(ua);
                break;
            }
        }
    }

    //to return the user on the basis of userName for login attempt functionality:
    public User getUser(String username) {
        System.out.println(userCatalog.size());
        return userCatalog.stream().filter(acc -> acc.getUsername().equals(username))
                .collect(Collectors.toList()).get(0);
    }
}
