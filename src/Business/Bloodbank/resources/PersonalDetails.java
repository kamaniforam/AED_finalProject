package org.business.medical.resources;

public class PersonalDetails {

	private String firstName;
	private String lastName;
	private String gender;
	private String contact;
	private String address;

	public PersonalDetails(String firstName, String lastName, String gender, String contact, String address) {
		
		this.firstName = firstName;
		this.lastName  = lastName;
		this.gender    = gender;
		this.contact   = contact;
		this.address   = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
