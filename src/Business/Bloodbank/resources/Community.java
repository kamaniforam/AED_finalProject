package org.business.medical.resources;

import java.util.ArrayList;

public class Community {

	private final Integer zipcode;
	private final String city;
	private final ArrayList<Hospital> hospitals = new ArrayList<Hospital>();
	private Person communityAdmin;
	private Person bloodReqAdmin;

	public Community(Integer zipcode, String city) {

		this.zipcode = zipcode;
		this.city = city;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public String getCity() {
		return city;
	}

	public ArrayList<Hospital> getHospitals() {
		return hospitals;
	}

	public Person getCommunityAdmin() {
		return communityAdmin;
	}

	public Person getBloodReqAdmin() {
		return bloodReqAdmin;
	}

	public void setCommunityAdmin(Person communityAdmin) {
		this.communityAdmin = communityAdmin;
	}

	public void setBloodReqAdmin(Person bloodReqAdmin) {
		this.bloodReqAdmin = bloodReqAdmin;
	}

}
