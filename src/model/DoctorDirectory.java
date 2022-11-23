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
public class DoctorDirectory {
    
    private ArrayList<Doctor> listOfDoctors;

    public ArrayList<Doctor> getListOfDoctors() {
        return listOfDoctors;
    }

    public void setListOfDoctors(Doctor listOfDoctors) {
        this.listOfDoctors.add(listOfDoctors);
    }
    
    public DoctorDirectory(){
        this.listOfDoctors = new ArrayList<>();
    }
    
    public Doctor addNewDoctor(){
        Doctor doc = new Doctor();
        listOfDoctors.add(doc);
        return doc;
    }
    
    public void deleteDoctor(Doctor doc){
        listOfDoctors.remove(doc);
    }
    
}
