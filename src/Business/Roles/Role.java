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
    DOCTOR("DOCTOR"),
    COMMUNITY_ADMINISTRATOR("COMMUNITY_ADMINISTRATOR"),
    HOSPITAL_ADMINISTRATOR("HOSPITAL_ADMINISTRATOR");

    private final String value;
    private Role(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Role fromString(String str) {
        return Role.valueOf(str.replaceAll(" ", "_").toUpperCase());
    }

    @Override
    public String toString() {
        return value;
    }
}
