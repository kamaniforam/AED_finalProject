/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharmacy.Model;

import java.util.ArrayList;

/**
 *
 * @author richajain
 */
public class VaccineInventory {
    
    private ArrayList<Vaccine> vaccineList;
    
    public VaccineInventory() {
        vaccineList = new ArrayList<>();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

     public Vaccine addVaccine(Vaccine vac) {
        vaccineList.add(vac);
        return vac;
    }

    public void deleteVaccine(Vaccine med) {
     vaccineList.remove(med);
    }
    
}
