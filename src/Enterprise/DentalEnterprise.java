/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import java.util.ArrayList;
import model.Role.Role;

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
