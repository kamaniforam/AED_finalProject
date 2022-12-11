package org.business.medical.resources;

public class Person {
	private PersonalDetails personalDetails;
	private Credentials credentials;
	private Community community;
	private Role role;
	
	public Person(PersonalDetails personalDetails, Credentials credentials, Community community, Role role) {

		this.community 			= community;
		this.credentials 		= credentials;
		this.personalDetails 	= personalDetails;
		this.role				= role;
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

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
