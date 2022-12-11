/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DentalHospital.Model;

import java.util.Date;

/**
 *
 * @author richajain
 */
public class Appointment {
    
    private DentalPatient patient;
    private String disease;
    private String prescription;
    private Date date;
    private String doctorName;

    public DentalPatient getPatient() {
        return patient;
    }

    public void setPatient(DentalPatient patient) {
        this.patient = patient;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    
    
}
