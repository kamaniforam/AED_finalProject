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
public class AppointmentDirectory {
    
    private ArrayList<Appointment> appointmentlist;

    public AppointmentDirectory() {
        appointmentlist = new ArrayList();
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentlist;
    }
    
    public Appointment createAppointment(){
        Appointment apt = new Appointment();
        return apt;
    }
    
}
