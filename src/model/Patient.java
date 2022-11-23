/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author foram
 */
public class Patient extends Person {

    private VitalSigns vitalSigns;
    private String patientD;
    private boolean isStable;

    public Patient(){
        
    }
    
    public Patient(String name, int age, int id, House house, VitalSigns vitalSigns, String patientID, boolean isStable) {
        super(name, age, id, house);
        this.vitalSigns = vitalSigns;
        this.patientD = patientID;
        this.isStable = isStable;
    }
    
  


    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getPatientD() {
        return patientD;
    }

    public void setPatientD(String patientD) {
        this.patientD = patientD;
    }

    public boolean isIsStable() {
        return isStable;
    }

    public void setIsStable(boolean isStable) {
        this.isStable = isStable;
    }

    public boolean isPatientNormal(int age) {
        boolean isPatientNormal = true;

        if (age < 50) {
            if (vitalSigns.getBloodPressure() < 80 || vitalSigns.getBloodPressure() > 120) {
                isPatientNormal = false;
            }
        } else {
            if (vitalSigns.getBloodPressure() < 95 || vitalSigns.getBloodPressure() > 105) {
                isPatientNormal = false;
            }
        }
        return isPatientNormal;
    }
    
    private boolean isNormal(int patAge) {
        boolean isNorm = false;
        if(patAge <= 40){
            if((vitalSigns.getBloodPressure() <= 130 && vitalSigns.getBloodPressure()>=90) && (vitalSigns.getHeartRate() <= 100 && vitalSigns.getHeartRate()>=90)){
            isNorm = true;
            }
            else{
            isNorm = false;
            }
            
        }
        else if (patAge >= 41 && patAge <= 100){
            if((vitalSigns.getBloodPressure()<= 140 && vitalSigns.getBloodPressure()>=100) && (vitalSigns.getHeartRate() <= 80 && vitalSigns.getHeartRate()>=70)){
            isNorm=  true;
            }
            else{
            isNorm = false;
            }
        }
        return isNorm;
        
    }

}
