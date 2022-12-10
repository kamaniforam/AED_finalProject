/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author richajain
 */
public class DentalEnterprise extends Enterprise {
    
    public DentalEnterprise(String name){
        super(name,EnterpriseClassification.Dental);
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
