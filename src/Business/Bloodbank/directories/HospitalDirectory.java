package business.Bloodbank.directories;

import business.Bloodbank.resources.BBHospital;
import java.util.ArrayList;


public final class HospitalDirectory {
	
	private static ArrayList<BBHospital> hospitals;
	
	private HospitalDirectory() {
		
	}
	
	public static ArrayList<BBHospital> getHospitals() {
		
		return hospitals;
	}
}