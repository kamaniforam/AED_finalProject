/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Organization.Organization.Type;

/**
 *
 * @author richajain
 */
public class OrganizationCatalog {
    
    private ArrayList<Organization> organizationList;

    public OrganizationCatalog() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    public Organization createOrganisation(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Surgery.getValue()))
        {
            
        }
       
        return organization;
    }
}
