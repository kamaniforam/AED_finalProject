package business.Bloodbank.resources;

import java.util.ArrayList;

public class Community {

	private Integer zipcode;
	private String city;
	private ArrayList<BBHospital> hospitals;
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

	public ArrayList<BBHospital> getHospitals() {
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
