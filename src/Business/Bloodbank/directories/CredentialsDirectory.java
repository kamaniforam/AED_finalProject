package business.Bloodbank.directories;

import java.util.ArrayList;

import business.Bloodbank.resources.Credentials;

public final class CredentialsDirectory {
	
	private static ArrayList<Credentials> credentials = new ArrayList<Credentials>();
	
	private CredentialsDirectory() {
		
	}
	
	public static ArrayList<Credentials> getCredentials() {
		
		return credentials;
	}
}
