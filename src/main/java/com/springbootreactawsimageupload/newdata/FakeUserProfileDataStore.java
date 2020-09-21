package com.springbootreactawsimageupload.newdata;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;


import com.springbootreactawsimageupload.profile.UserProfile;



@Repository
public class FakeUserProfileDataStore {
	private static final List<UserProfile> USER_PROFILES=new ArrayList<>();
	 static {
		      USER_PROFILES.add(new UserProfile(UUID.fromString("1a9103c6-5f18-4e2c-8a98-4e261fca7b4b"), "sada",null));
		      USER_PROFILES.add(new UserProfile(UUID.fromString("34fb7ac1-11e5-4a92-955f-9b32ac2399b2"), "John",null));
	}
	
 public List<UserProfile> getUserProfiles(){
	 return USER_PROFILES;
 }
}
