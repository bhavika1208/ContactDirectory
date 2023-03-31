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
@Table(name="email")
public class Email {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emailId")
	private int emailId;
	
	
	@Column(name="contactId")	
	private int contactId;
	
	@Column(name="emailType")
	private String emailType;
	
	@Column(name="email")
	private String email;

	@Column(name="isActive")
	private boolean isActive=true;


	@CreationTimestamp
	@Column(name="createdAt")
	private Timestamp createdAt;


	@CreationTimestamp
	@Column(name="modifiedAt")
	private Timestamp modifiedAt;

	public Email() {
	}
	public Email(int contactId, String emailType, String email, boolean isActive, Timestamp createdAt,
			Timestamp modifiedAt) {
		super();
		this.contactId = contactId;
		this.emailType = emailType;
		this.email = email;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}
	public int getEmailId() {
		return emailId;
	}
	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
		return "Email [emailId=" + emailId + ", contactId=" + contactId + ", emailType=" + emailType + ", email="
				+ email + ", isActive=" + isActive + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
	}
	
	
	
	
}
