/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.time.LocalDateTime;

/**
 *
 * @author richajain
 */
public class DoctorAvailableSlotWR extends WorkRequest {
    
    private String doctor;
    private LocalDateTime timings;
    private String patient;
    

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getTimings() {
        return timings;
    }

    public void setTimings(LocalDateTime timings) {
        this.timings = timings;
    }
    
    @Override
    public String toString() {
        return this.doctor;
    }
    
}
