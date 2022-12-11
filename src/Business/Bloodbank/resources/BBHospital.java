package business.Bloodbank.resources;

import java.util.ArrayList;

public class BBHospital {

	private Community community;
	private ArrayList<BloodGroupDetails> bloodGroupDetails;
	private HospitalDetails hospitalDetails;
	private Person hospitalAdmin;

	public BBHospital(Community community, ArrayList<BloodGroupDetails> bloodGroupDetails, HospitalDetails hospitalDetails) {
		super();
		this.community = community;
		this.bloodGroupDetails = bloodGroupDetails;
		this.hospitalDetails = hospitalDetails;
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}

	public ArrayList<BloodGroupDetails> getAllBloodGroups() {
		return bloodGroupDetails;
	}

	public void setAllBloodGroups(ArrayList<BloodGroupDetails> bloodGroupDetails) {
		this.bloodGroupDetails = bloodGroupDetails;
	}

	public HospitalDetails getHospitalDetails() {
		return hospitalDetails;
	}

	public void setHospitalDetails(HospitalDetails hospitalDetails) {
		this.hospitalDetails = hospitalDetails;
	}

	public Person getHospitalAdmin() {
		return hospitalAdmin;
	}

	public void setHospitalAdmin(Person hospitalAdmin) {
		this.hospitalAdmin = hospitalAdmin;
	}
}
