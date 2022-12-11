/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;
/**
 *
 * @author foram
 */
public enum Role {
    
    SYSTEM_ADMINISTRATOR("SYSTEM_ADMINISTRATOR"),
    PATIENT("PATIENT"),
    HOSPITAL_ADMINISTRATOR("HOSPITAL_ADMINISTRATOR"),
    SUPER_ADMIN("SUPER ADMIN"),
    
    PHARMACY_ADMIN("PHARMACY_ADMIN"),
    RECEPTIONIST("RECEPTIONIST"),
    DENTAL_PATIENT("DENTAL_PATIENT"),
    DENTIST("DENTIST"),
    
    BLOODBANK_USER("BLOODBANK_USER"),
    BLOODBANK_SYSTEM_ADMINISTRATOR("BLOODBANK_SYSTEM_ADMINISTRATOR"),
    BLOODBANK_COMMUNITY_ADMINISTRATOR("BLOODBANK_COMMUNITY_ADMINISTRATOR"),
    BLOODBANK_HOSPITAL_ADMINISTRATOR("HOSPITAL_ADMINISTRATOR"),
    BLOOD_REQUEST_ADMIN("BLOOD_REQUEST_ADMIN");

    private final String value;
    private Role(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Role fromString(String str) {
        try {
            return Role.valueOf(str.replaceAll(" ", "_").toUpperCase());
        } catch(Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
