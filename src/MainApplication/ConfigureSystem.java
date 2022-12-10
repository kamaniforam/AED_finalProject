/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainApplication;

import model.Employee.Employee;
import model.Pharmacy.Medicine;
import model.Pharmacy.MedicinesInventory;
import model.Pharmacy.Organization.PharmacyOrganization;
import model.Pharmacy.Role.PharmacyRole;
import model.Pharmacy.Vaccine;
import model.Pharmacy.VaccineInventory;
import model.Role.SysAdmin;
import model.User;
import model.WorkQueue.MedicineWorkRequest;
import model.WorkQueue.VaccineWorkRequest;

/**
 *
 * @author richajain
 */
public class ConfigureSystem {
    
    public static Ecosystem configure()
    {    
        Ecosystem system = Ecosystem.getInstance();
        System.out.println(system);
        Employee employee = system.getEmployeeCatalog().addEmployee("hbadmin");
        Employee employee1 = system.getEmployeeCatalog().addEmployee("padmin");
        User user1 = system.getUserCatalog().newUserAccount("padmin", "padmin", employee1, new PharmacyRole());
        User user = system.getUserCatalog().newUserAccount("hbadmin", "hbadmin", employee, new SysAdmin());
        
        Medicine med1 = new Medicine();
        med1.setMedicineName("Med1");
        med1.setAvailQuantity(5);
        med1.setSellingPrice(10);
        med1.setCategory("Cold");
        
        Medicine med2 = new Medicine();
        med2.setMedicineName("Med2");
        med2.setAvailQuantity(10);
        med2.setSellingPrice(12);
        med2.setCategory("Fever");
        
        Medicine med3 = new Medicine();
        med3.setMedicineName("Med3");
        med3.setAvailQuantity(2);
        med3.setSellingPrice(15);
        med3.setCategory("Cough");
        
        MedicinesInventory medInv = new MedicinesInventory();
        medInv.addMedicine(med1);
        medInv.addMedicine(med2);
        medInv.addMedicine(med3);
        
        Vaccine vc1 = new Vaccine();
        vc1.setVaccineName("Vaccine1");
        vc1.setAvailQuantity(10);
        vc1.setSellingPrice(15);
        vc1.setCategory("Flu");
        
        Vaccine vc2 = new Vaccine();
        vc2.setVaccineName("Vaccine2");
        vc2.setAvailQuantity(12);
        vc2.setSellingPrice(8);
        vc2.setCategory("Virus");
        
        Vaccine vc3 = new Vaccine();
        vc3.setVaccineName("Vaccine3");
        vc3.setAvailQuantity(2);
        vc3.setSellingPrice(20);
        vc3.setCategory("Boost");
        
        VaccineInventory vcInv = new VaccineInventory();
        vcInv.addVaccine(vc1);
        vcInv.addVaccine(vc2);
        vcInv.addVaccine(vc3);
        
        return system;
    }
    
    public static PharmacyOrganization dataGenerate(){
        
        PharmacyOrganization org = new PharmacyOrganization();
        
        Medicine med1 = new Medicine();
        med1.setMedicineName("Med1");
        med1.setAvailQuantity(5);
        med1.setSellingPrice(10);
        med1.setCategory("Cold");
        
        
        Medicine med2 = new Medicine();
        med2.setMedicineName("Med2");
        med2.setAvailQuantity(10);
        med2.setSellingPrice(12);
        med2.setCategory("Fever");
        
        Medicine med3 = new Medicine();
        med3.setMedicineName("Med3");
        med3.setAvailQuantity(2);
        med3.setSellingPrice(15);
        med3.setCategory("Cough");
        
        MedicinesInventory medInv = new MedicinesInventory();
        medInv.addMedicine(med1);
        medInv.addMedicine(med2);
        medInv.addMedicine(med3);
        
        Vaccine vc1 = new Vaccine();
        vc1.setVaccineName("Vaccine1");
        vc1.setAvailQuantity(10);
        vc1.setSellingPrice(15);
        vc1.setCategory("Flu");
        
        Vaccine vc2 = new Vaccine();
        vc2.setVaccineName("Vaccine2");
        vc2.setAvailQuantity(12);
        vc2.setSellingPrice(8);
        vc2.setCategory("Virus");
        
        Vaccine vc3 = new Vaccine();
        vc3.setVaccineName("Vaccine3");
        vc3.setAvailQuantity(2);
        vc3.setSellingPrice(20);
        vc3.setCategory("Boost");
        
        VaccineInventory vcInv = new VaccineInventory();
        vcInv.addVaccine(vc1);
        vcInv.addVaccine(vc2);
        vcInv.addVaccine(vc3);
        
        Ecosystem system = Ecosystem.getInstance();
        Employee employee1 = system.getEmployeeCatalog().addEmployee("padmin");
        User user1 = system.getUserCatalog().newUserAccount("padmin", "padmin", employee1, new PharmacyRole());
        
        MedicineWorkRequest request = new MedicineWorkRequest();
        request.setMedicationName("Med1");
        request.setQuantity(4);
        request.setStatus("Pending");
        request.setPatientName("Patient");
        
        MedicineWorkRequest request1 = new MedicineWorkRequest();
        request1.setMedicationName("Med2");
        request1.setQuantity(5);
        request1.setStatus("Pending");
        request1.setPatientName("Patient");
        
        VaccineWorkRequest request2 = new VaccineWorkRequest();
        request2.setVaccineName("Vaccine1");
        request2.setQuantity(20);
        request2.setStatus("Pending");
        
        VaccineWorkRequest request3 = new VaccineWorkRequest();
        request3.setVaccineName("Vaccine2");
        request3.setQuantity(1);
        request3.setStatus("Pending");
        
        org.getWorkQueue().getWorkRequestList().add(request);
        org.getWorkQueue().getWorkRequestList().add(request1);
        org.getWorkQueue().getWorkRequestList().add(request2);
        org.getWorkQueue().getWorkRequestList().add(request3);
        
        org.addMedicine(med1);
        org.addMedicine(med2);
        org.addMedicine(med3);
        
        org.addVaccine(vc1);
        org.addVaccine(vc2);
        org.addVaccine(vc3);
        
        System.out.println(org.getMedList().size());
        System.out.println(org.getVacList().size());
       return org; 
    }
    
}
