package org.business.medical.resources;

public class HospitalDetails {

	private String address;
	private String hospitalName;

	public HospitalDetails(String address, String hospitalName) {

		this.address = address;
		this.hospitalName = hospitalName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
}
