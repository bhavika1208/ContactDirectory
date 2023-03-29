package com.bhavika.cd.contactDirectory.entity;

import java.security.Timestamp;

public class Contact {
	
	private int contactId;
	private int userId;
	private String contactName;
	private boolean isFavourite;
	private boolean isActive;
	private String profilePicture;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	
	public Contact() {
		
	}
	
	public Contact(int userId, String contactName, boolean isFavourite, boolean isActive, String profilePicture,
			Timestamp createdAt, Timestamp modifiedAt) {
		super();
		this.userId = userId;
		this.contactName = contactName;
		this.isFavourite = isFavourite;
		this.isActive = isActive;
		this.profilePicture = profilePicture;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public boolean isFavourite() {
		return isFavourite;
	}
	public void setFavourite(boolean isFavourite) {
		this.isFavourite = isFavourite;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", userId=" + userId + ", contactName=" + contactName
				+ ", isFavourite=" + isFavourite + ", isActive=" + isActive + ", profilePicture=" + profilePicture
				+ ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
	}
	
	

}
