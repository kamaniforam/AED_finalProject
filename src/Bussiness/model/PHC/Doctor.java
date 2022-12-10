/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.model.PHC;

import javax.swing.ImageIcon;

/**
 *
 * @author foram
 */
public class Doctor {
    
    private String doctorName;
    private int doctorId;
    private ImageIcon uploadPhoto;
    private Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public ImageIcon getUploadPhoto() {
        return uploadPhoto;
    }

    public void setUploadPhoto(ImageIcon uploadPhoto) {
        this.uploadPhoto = uploadPhoto;
    }
    
}
