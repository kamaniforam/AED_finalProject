/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author foram
 */
public class Encounter {
    private String patientID;
    private VitalSigns vitalSigns;
    private LocalDateTime dateOfVisit;
    private boolean isStable;
    
    public Encounter(VitalSigns vitalsigns){
        this.vitalSigns = vitalSigns;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public LocalDateTime getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(LocalDateTime dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public boolean isIsStable() {
        return isStable;
    }

    public void setIsStable(boolean isStable) {
        this.isStable = isStable;
    }

}
