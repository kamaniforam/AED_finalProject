/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Organization.Organization.Type;
import model.Pharmacy.Organization.PharmacyOrganization;

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
        if (type.getValue().equals(Type.Pharmacy.getValue()))
        {
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    
    }
}
