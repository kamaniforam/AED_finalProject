package org.business.medical.directories;

import java.util.ArrayList;

import org.business.medical.resources.Hospital;

public final class HospitalDirectory {
	
	private static ArrayList<Hospital> hospitals = new ArrayList<Hospital>();
	
	private HospitalDirectory() {
		
	}
	
	public static ArrayList<Hospital> getHospitals() {
		
		return hospitals;
	}
}