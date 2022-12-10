/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharmacy.Organizations;

import Business.Organization;
import Business.Roles.Role;
import java.util.ArrayList;
import model.Pharmacy.Medicine;
import model.Pharmacy.Vaccine;


/**
 *
 * @author richajain
 */
public class PharmacyOrganization extends Organization{

    private ArrayList<Medicine> medList;
    private ArrayList<Vaccine> vacList;
    
    public PharmacyOrganization() {
     
       super(Organization.Type.Pharmacy.getValue());
       
        medList=new ArrayList<Medicine>();
        vacList = new ArrayList<Vaccine>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(Role.PHARMACY);
        return roles;
    }

    public ArrayList<Medicine> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<Medicine> medList) {
        this.medList = medList;
    }
    
     public void addMedicine(Medicine mi)
    {
       
        medList.add(mi);
        
    }
     
    public ArrayList<Vaccine> getVacList() {
        return vacList;
    }

    public void setVacList(ArrayList<Vaccine> vacList) {
        this.vacList = vacList;
    }
    
     public void addVaccine(Vaccine vac)
    {
       
        vacList.add(vac);
        
    }
    
}
