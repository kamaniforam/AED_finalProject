/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author foram
 */
public class PatientDirectory {
    
    private ArrayList<Patient> listOfPatients;
    
    public PatientDirectory(){
        this.listOfPatients = new ArrayList<>();
    }

    public ArrayList<Patient> getListOfPatients() {
        return listOfPatients;
    }

    public void setListOfPatients(ArrayList<Patient> listOfPatients) {
        this.listOfPatients = listOfPatients;
    }
    
    public void addPatient(Patient patient){
        this.listOfPatients.add(patient);
    }
    
}
    

