package com.bhavika.cd.contactDirectory.entity;

import java.security.Timestamp;

public class Address {
	
	private int addressId;
	private int contactId;
	private String addressType;
	private String address;
	private int addressCity;
	private int addressState;
	private int addressPincode;
    private boolean isActive;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    
    
    
    
	public Address() {
		
	}
	public Address(int contactId, String addressType, String address, int addressCity, int addressState,
			int addressPincode, boolean isActive, Timestamp createdAt, Timestamp modifiedAt) {
		super();
		this.contactId = contactId;
		this.addressType = addressType;
		this.address = address;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressPincode = addressPincode;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(int addressCity) {
		this.addressCity = addressCity;
	}
	public int getAddressState() {
		return addressState;
	}
	public void setAddressState(int addressState) {
		this.addressState = addressState;
	}
	public int getAddressPincode() {
		return addressPincode;
	}
	public void setAddressPincode(int addressPincode) {
		this.addressPincode = addressPincode;
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
		return "Address [addressId=" + addressId + ", contactId=" + contactId + ", addressType=" + addressType
				+ ", address=" + address + ", addressCity=" + addressCity + ", addressState=" + addressState
				+ ", addressPincode=" + addressPincode + ", isActive=" + isActive + ", createdAt=" + createdAt
				+ ", modifiedAt=" + modifiedAt + "]";
	}
    
    
    
    
    
    
}
