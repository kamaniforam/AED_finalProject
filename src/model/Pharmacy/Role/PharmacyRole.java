/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Pharmacy.Role;

import Enterprise.Enterprise;
import MainApplication.Ecosystem;
import MainApplication.Network;
import javax.swing.JPanel;
import model.Organization.Organization;
import model.Pharmacy.Organization.PharmacyOrganization;
import model.Role.Role;
import model.User;
import uiComponents.Pharmacy.PharmacyAdminWorkAreaJPanel;

/**
 *
 * @author richajain
 */
public class PharmacyRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, Network network, Ecosystem system) {
        return new PharmacyAdminWorkAreaJPanel(userProcessContainer, account, (PharmacyOrganization)organization,enterprise,network);
    }
    
}
