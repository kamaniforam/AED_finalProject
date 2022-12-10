/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Bussiness.model.PHC.DoctorDirectory;
import Bussiness.model.PHC.EncounterHistory;
import Bussiness.model.PHC.HospitalDirectory;
import Bussiness.model.PHC.PatientDirectory;
import Bussiness.model.PHC.PersonDirectory;
import java.util.ArrayList;
import Business.Roles.Role;

/**
 *
 * @author foram
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private EncounterHistory encounterHistory;
    private HospitalDirectory hospitalDirectory;
    
    public EcoSystem(PersonDirectory personDirectory, PatientDirectory patientDirectory, EncounterHistory encounterHistory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory) {
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
    }

    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }
    
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(Role.SYSTEM_ADMINISTRATOR);
        return roleList;
    }
    private EcoSystem(){
        super(null);
      
       personDirectory = new PersonDirectory();
       patientDirectory = new PatientDirectory();
       encounterHistory = new EncounterHistory();
       doctorDirectory = new DoctorDirectory();
       hospitalDirectory = new HospitalDirectory();
       
    }

    public boolean checkIfUserIsUnique(String userName){ 
       return false;
    }
}
