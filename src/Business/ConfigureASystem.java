package Business;

import Bussiness.model.PHC.Employee;
import Business.Roles.Role;
import Bussiness.model.PHC.UserAccount;

/**
 *
 * @author foram
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");      
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("fk", "fk", employee, Role.SYSTEM_ADMINISTRATOR);       
        return system;
    }
    
}
