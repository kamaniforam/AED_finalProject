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
public class PharmacyEnterprise extends Enterprise {
    
    public PharmacyEnterprise(String name){
        super(name,EnterpriseClassification.Pharmacy);
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
