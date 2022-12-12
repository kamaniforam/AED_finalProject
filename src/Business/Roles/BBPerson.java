package Business.Roles;

import Business.Bloodbank.resources.BBCommunity;
import business.Bloodbank.resources.Credentials;
import business.Bloodbank.resources.PersonalDetails;

public class BBPerson {

    private PersonalDetails personalDetails;
    private Credentials credentials;
    private BBCommunity community;
    private Role roles;

    public BBPerson(PersonalDetails personalDetails, Credentials credentials, BBCommunity community, Role role) {

        this.community = community;
        this.credentials = credentials;
        this.personalDetails = personalDetails;
        this.roles = role;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public BBCommunity getCommunity() {
        return community;
    }

    public void setCommunity(BBCommunity community) {
        this.community = community;
    }

    public Role getRole() {
        return roles;
    }

    public void setRole(Role role) {
        this.roles = role;
    }
}
