package com.bhavika.cd.contactDirectory.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="phoneId")
	private int phoneId;
	
	@Column(name="contactId")
	private int contactId;

	@Column(name="phoneType")
	private String phoneType;

	@Column(name="phoneNo")
	private String phoneNo;

	@Column(name="isActive")
	private boolean isActive;
	
	@CreationTimestamp
	@Column(name="createdAt")
	private Timestamp createdAt;

	@CreationTimestamp
	@Column(name="modifiedAt")
	private Timestamp modifiedAt;
	
	public Phone() {
	}
	public Phone(int contactId, String phoneType, String phoneNo, boolean isActive, Timestamp createdAt,
			Timestamp modifiedAt) {
		super();
		this.contactId = contactId;
		this.phoneType = phoneType;
		this.phoneNo = phoneNo;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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
		return "Phone [phoneId=" + phoneId + ", contactId=" + contactId + ", phoneType=" + phoneType + ", phoneNo="
				+ phoneNo + ", isActive=" + isActive + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
	}

	
	

}
