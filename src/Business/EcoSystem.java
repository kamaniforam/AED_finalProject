/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Pharmacy.Organizations.PharmacyOrganization;
import Bussiness.model.PHC.DoctorDirectory;
import Bussiness.model.PHC.EncounterHistory;
import Bussiness.model.PHC.HospitalDirectory;
import Bussiness.model.PHC.PatientDirectory;
import Bussiness.model.PHC.PersonDirectory;
import java.util.ArrayList;
import Business.Roles.Role;
import Business.WorkQueue.WorkQueue;
import Business.db40Utility.DB4OUtil;
import Bussiness.model.PHC.UserAccountDirectory;

/**
 *
 * @author foram
 */
public class EcoSystem{
    
    private static EcoSystem business;
    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private EncounterHistory encounterHistory;
    private HospitalDirectory hospitalDirectory;
    private WorkQueue workQueue;
    private UserAccountDirectory userDirectory;
    private PharmacyOrganization phOrg;
    
    public EcoSystem(PersonDirectory personDirectory, PatientDirectory patientDirectory, EncounterHistory encounterHistory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory,UserAccountDirectory userDirectory, WorkQueue wq, PharmacyOrganization phOrg) {
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.userDirectory = userDirectory;
        this.phOrg = phOrg;
        this.workQueue = wq;
    }

    public static EcoSystem getInstance(){
        if(business==null){
            business=DB4OUtil.getInstance().retrieveSystem();
        }
        return business;
    }

    public static EcoSystem getBusiness() {
        return business;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userDirectory;
    }

    public void getUserAccountDirectory(UserAccountDirectory userDirectory) {
        this.userDirectory = userDirectory;
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
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(Role.SYSTEM_ADMINISTRATOR);
        return roleList;
    }
    
    public EcoSystem(){
        
       personDirectory = new PersonDirectory();
       patientDirectory = new PatientDirectory();
       encounterHistory = new EncounterHistory();
       doctorDirectory = new DoctorDirectory();
       hospitalDirectory = new HospitalDirectory();
       userDirectory = new UserAccountDirectory();
       workQueue = new WorkQueue();
       phOrg = new PharmacyOrganization();
    }

    public PharmacyOrganization getPhOrg() {
        return phOrg;
    }

    public void setPhOrg(PharmacyOrganization phOrg) {
        this.phOrg = phOrg;
    }
}
