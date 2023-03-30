package com.bhavika.cd.contactDirectory.entity;

import java.security.Timestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "userPassword")
	private String userPassword;

	@Column(name = "userEmail")
	private String userEmail;

	@Column(name = "userAddress")
	private String userAddress;

	@Column(name = "userPhoneNo")
	private String userPhoneNo;

	@Column(name = "isActive")
	private boolean isActive;
	
	@Column(name = "createdAt")
	private Timestamp createdAt;

	@Column(name = "modifiedAt")	
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
