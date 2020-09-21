package com.springbootreactawsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
	private final UUID userProfileId;
	private final String userName;
	private   String userProfileImageLink;
	public UserProfile(UUID userProfileId,
			String userName, 
			String userProfileImageLink) {
		
		this.userProfileId = userProfileId;
		this.userName = userName;
		this.userProfileImageLink = userProfileImageLink;
	}
	public UUID getUserProfileId() {
		return userProfileId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Optional<String> getUserProfileImageLink() {
		return Optional.ofNullable(userProfileImageLink);
	}
	public void setUserProfileImageLink(String userProfileImageLink) {
		this.userProfileImageLink = userProfileImageLink;
	}
	@Override
	public int hashCode() {
		return Objects.hash(userProfileId,userName,userProfileImageLink);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfile other = (UserProfile) obj;
		return Objects.equals(userProfileId, other.userProfileId)&&
				Objects.equals(userName, other.userName) && 
				Objects.equals(userProfileImageLink, other.userProfileImageLink);
	}
	


}
