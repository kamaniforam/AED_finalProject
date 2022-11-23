/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validations;

import java.util.HashMap;
import model.UserDetails;

/**
 *
 * @author foram
 */
public class LoginCreds {

    public HashMap<String, UserDetails> loginInfo = new HashMap<>();

    
    public LoginCreds() {
        UserDetails user1 = new UserDetails("system admin", "foram", UserDetails.Roles.SYSTEM_ADMINISTRATOR);
        UserDetails user2 = new UserDetails("patient", "foram", UserDetails.Roles.PATIENT);
        UserDetails user3 = new UserDetails("doctor", "foram", UserDetails.Roles.DOCTOR);
        UserDetails user4 = new UserDetails("community admin", "foram", UserDetails.Roles.COMMUNITY_ADMINISTRATOR);
        UserDetails user5 = new UserDetails("hospital admin", "foram", UserDetails.Roles.HOSPITAL_ADMINISTRATOR);
        
        
        loginInfo.put(user1.getUserName(), user1);
        loginInfo.put(user2.getUserName(), user2);
        loginInfo.put(user3.getUserName(), user3);
        loginInfo.put(user4.getUserName(), user4);
        loginInfo.put(user5.getUserName(), user5);
        
        
    }
    
    public boolean doLogin(String username, String password, String roleStr) {
        UserDetails user = loginInfo.getOrDefault(username, null);
        UserDetails.Roles role = UserDetails.Roles.fromString(roleStr);
        
        if(user == null) {
            return false;
        }
        
        return user.validateCreds(username, password, role);
    }
}
