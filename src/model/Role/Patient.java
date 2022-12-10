/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import Enterprise.Enterprise;
import MainApplication.Network;
import javax.swing.JPanel;
import model.User;

/**
 *
 * @author richajain
 */
public class Patient extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new SysAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
