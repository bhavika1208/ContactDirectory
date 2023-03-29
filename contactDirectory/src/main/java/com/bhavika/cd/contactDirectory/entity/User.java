package com.bhavika.cd.contactDirectory.entity;

import java.security.Timestamp;

public class User {
	
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userAddress;
	private String userPhoneNo;
	private boolean isActive;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	
	
	
	public User() {
	}
	public User(String userName, String userPassword, String userEmail, String userAddress, String userPhoneNo,
			boolean isActive, Timestamp createdAt, Timestamp modifiedAt) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userPhoneNo = userPhoneNo;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhoneNo() {
		return userPhoneNo;
	}
	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
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
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + ", userAddress=" + userAddress + ", userPhoneNo=" + userPhoneNo + ", isActive=" + isActive
				+ ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
	}
	
	
	

}
