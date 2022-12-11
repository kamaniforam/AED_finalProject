/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DentalHospital.Model;

import java.util.ArrayList;

/**
 *
 * @author richajain
 */
public class DentalPatientDirectory {
    
    private ArrayList<DentalPatient> listOfPatients;
    
    public DentalPatientDirectory(){
        this.listOfPatients = new ArrayList<>();
    }

    public ArrayList<DentalPatient> getListOfPatients() {
        return listOfPatients;
    }

    public void setListOfDoctors(DentalPatient listOfPatients) {
        this.listOfPatients.add(listOfPatients);
    }
    
    public DentalPatient addNewDoctor(){
        DentalPatient patient = new DentalPatient();
        listOfPatients.add(patient);
        return patient;
    }
    
    public void deleteDoctor(DentalPatient patient){
        listOfPatients.remove(patient);
    }
    
}
