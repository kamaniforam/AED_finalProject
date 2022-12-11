package org.business.medical.directories;

import java.util.ArrayList;

import org.business.medical.resources.Credentials;

public final class CredentialsDirectory {
	
	private static ArrayList<Credentials> credentials = new ArrayList<Credentials>();
	
	private CredentialsDirectory() {
		
	}
	
	public static ArrayList<Credentials> getCredentials() {
		
		return credentials;
	}
}
