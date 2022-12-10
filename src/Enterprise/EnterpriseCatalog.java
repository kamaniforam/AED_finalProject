/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import java.util.ArrayList;

/**
 *
 * @author richajain
 */
public class EnterpriseCatalog {
    
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseCatalog(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseClassification type){
        Enterprise enterprise=null;
        if(type == Enterprise.EnterpriseClassification.Dental){
            enterprise = new DentalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseClassification.Pharmacy){
            enterprise = new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }

        
        return enterprise;
    } 
    
    
     public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseClassification type, String cause){
        Enterprise enterprise=null;
        if(type == Enterprise.EnterpriseClassification.Dental){
            enterprise = new DentalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }    
}
