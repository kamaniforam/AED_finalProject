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
public class MedicinesInventory {

    private ArrayList<Medicine> medicineList;

    public MedicinesInventory() {
        medicineList = new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

     public Medicine addMedicine(Medicine med) {
        medicineList.add(med);
        return med;
    }

    public void deleteMedicine(Medicine med) {
     medicineList.remove(med);
    }

}
