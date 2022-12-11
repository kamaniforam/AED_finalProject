package org.business.medical.directories;

import java.util.ArrayList;

import org.business.medical.resources.Community;

public final class CommunityDirectory {
	
	private static ArrayList<Community> communities = new ArrayList<Community>();
	
	private CommunityDirectory() {
		
	}
	
	public static ArrayList<Community> getCommunities() {
		
		return communities;
	}
}
