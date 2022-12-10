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
import uiComponents.SysAdminPanel.SysAdminWorkAreaJPanel;

/**
 *
 * @author richajain
 */
public class SysAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organisation, Enterprise enterprise, Network network, Ecosystem system) {
        return new SysAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
