/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import Business.Organization;
import Business.OrganizationCatalog;


/**
 *
 * @author richajain
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseClassification enterpriseClassification;
    private OrganizationCatalog organizationList;
    
    public Enterprise(String enterpriseName, EnterpriseClassification classification){
        super(enterpriseName);
        this.enterpriseClassification = classification;
        organizationList= new OrganizationCatalog();
    }
    
    public enum EnterpriseClassification{
                Dental("Dental"),
                Pharmacy("Pharmacy");
                
                private String val;
                private EnterpriseClassification(String val){
                    this.val=val;
                }

        public String getVal() {
            return val;
        }

        @Override
        public String toString() {
            return val;
        }           
    }
    public OrganizationCatalog getOrganizationCatalog() {
        return organizationList;
    }
    public EnterpriseClassification getEnterpriseClassification() {
        return enterpriseClassification;
    }

    public void setEnterpriseClassification(EnterpriseClassification enterpriseClassification) {
        this.enterpriseClassification = enterpriseClassification;
    }
}
