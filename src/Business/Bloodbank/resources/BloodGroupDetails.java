package org.business.medical.resources;

public class BloodGroupDetails {

	private String bloodGroup;
	private Integer availableUnits;

	public BloodGroupDetails(String bloodGroup, Integer availableUnits) {

		this.bloodGroup = bloodGroup;
		this.availableUnits = availableUnits;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Integer getAvailableUnits() {
		return availableUnits;
	}

	public void setAvailableUnits(Integer availableUnits) {
		this.availableUnits = availableUnits;
	}
}
