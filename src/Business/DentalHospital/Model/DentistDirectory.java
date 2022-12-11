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
public class DentistDirectory {
    
    private ArrayList<Dentist> dentistlist;

    public DentistDirectory() {
        dentistlist = new ArrayList();
    }

    public ArrayList<Dentist> getDentistList() {
        return dentistlist;
    }
    
    public Dentist createDentist(){
        Dentist dentist = new Dentist();
        return dentist;
    }
    
}
