/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import Enterprise.Enterprise;
import MainApplication.Ecosystem;
import MainApplication.Network;
import javax.swing.JPanel;
import model.Organization.Organization;
import model.User;

/**
 *
 * @author richajain
 */
public abstract class Role {
    
    public enum RoleType {
        Doctor("Doctor"),
        Surgeon("Surgeon"),
        Patient("Patient"),
        Dentist("Dentist"),
        Attendant("Attendant"),
        FrontDesk("Front Desk");
        
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
     public abstract JPanel createWorkArea(JPanel userProcessContainer,
            User account,
            Organization organisation,
            Enterprise enterprise,
            Network network,
            Ecosystem system);
}
