package com.bhavika.cd.contactDirectory.entity;


import java.sql.Timestamp;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="contactId")
	private int contactId;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="contactName")
	private String contactName;

	@Column(name="isFavourite")
	private boolean isFavourite;
	
	@Column(name="isActive")
	private boolean isActive;

	@Column(name="profilePicture")
	private String profilePicture;
	
	@CreationTimestamp
	@Column(name="createdAt")
	private Timestamp createdAt;

	@CreationTimestamp
	@Column(name="modifiedAt")
	private Timestamp modifiedAt;
	
	
	@OneToMany(mappedBy = "addressId", cascade = CascadeType.ALL)
	private List<Address> theAddresses;
	
	@OneToMany(mappedBy = "phoneId", cascade = CascadeType.ALL)
	private List<Phone> thePhones;
	
	@OneToMany(mappedBy = "emailId", cascade = CascadeType.ALL)
	private List<Email> theEmails;
	
	
	public Contact() {
		
	}
	
	public Contact(int contactId, int userId, String contactName, boolean isFavourite, boolean isActive,
			String profilePicture, Timestamp createdAt, Timestamp modifiedAt, List<Address> theAddresses,
			List<Phone> thePhones, List<Email> theEmails) {
		super();
		this.contactId = contactId;
		this.userId = userId;
		this.contactName = contactName;
		this.isFavourite = isFavourite;
		this.isActive = isActive;
		this.profilePicture = profilePicture;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.theAddresses = theAddresses;
		this.thePhones = thePhones;
		this.theEmails = theEmails;
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
	public List<Address> getTheAddresses() {
		return theAddresses;
	}

	public void setTheAddresses(List<Address> theAddresses) {
		this.theAddresses = theAddresses;
	}

	public List<Phone> getThePhones() {
		return thePhones;
	}

	public void setThePhones(List<Phone> thePhones) {
		this.thePhones = thePhones;
	}

	public List<Email> getTheEmails() {
		return theEmails;
	}

	public void setTheEmails(List<Email> theEmails) {
		this.theEmails = theEmails;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", userId=" + userId + ", contactName=" + contactName
				+ ", isFavourite=" + isFavourite + ", isActive=" + isActive + ", profilePicture=" + profilePicture
				+ ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
	}
	
	

}
