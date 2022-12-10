/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.model.PHC;

import Business.Roles.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public boolean authenticateUser(String username, String password, String uirole) {
        for (UserAccount ua : userAccountList) {
            //System.out.println("authentication:");
            //System.out.printf("user: %s, role: %s\n",ua.toString() ,ua.getRole().toString());
      
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password) && ua.getRole().equals(Role.fromString(uirole))) {
                //System.out.println("AUthList Role: " +ua.getRole());   
                return true;
            }
        }
        return false;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public HashMap<String, Role> loginInfo = new HashMap<>();

    public boolean doLogin(String username, String password, String roleStr) {
        Role user = loginInfo.getOrDefault(username, null);
        Role role = Role.fromString(roleStr);

        return user != null;
    }
}
