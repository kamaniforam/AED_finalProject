package Business;

import Business.Pharmacy.Model.Medicine;
import Business.Pharmacy.Model.Vaccine;
import Business.Pharmacy.Organizations.PharmacyOrganization;
import Business.Roles.Role;

/**
 *
 * @author foram
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = new EcoSystem();
        system.getUserAccountDirectory().createUserAccount("fk", "fk", Role.SYSTEM_ADMINISTRATOR);       
        system.getUserAccountDirectory().createUserAccount("rj", "rj", Role.SUPER_ADMIN);
        system.getUserAccountDirectory().createUserAccount("fk", "fk", Role.PHARMACY_ADMIN);       
        
        return system;
    }
    
    public static void generateData(PharmacyOrganization phOrg){
        Medicine med1 = new Medicine();
        med1.setMedicineName("Diaclogen");
        med1.setAvailQuantity(5);
        med1.setSellingPrice(10);

        Medicine med2 = new Medicine();
        med2.setMedicineName("Crocin");
        med2.setAvailQuantity(7);
        med2.setSellingPrice(5);
        phOrg.addMedicine(med1);
        phOrg.addMedicine(med2);
        
        Vaccine vac1 = new Vaccine();
        vac1.setVaccineName("COVID-19");
        vac1.setAvailQuantity(5);
        vac1.setSellingPrice(10);

        Vaccine vac2 = new Vaccine();
        vac2.setVaccineName("INFLUENZA");
        vac2.setAvailQuantity(7);
        vac2.setSellingPrice(5);
        
        phOrg.addVaccine(vac1);
        phOrg.addVaccine(vac2);

    }
}
