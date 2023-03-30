package com.bhavika.cd.contactDirectory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="city")
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cityId")
	private int cityId;
	
	@Column(name="cityName")
	private String cityName;
	
	@Column(name="cityStateId")
	private int cityStateId;

	public City() {
	}

	public City(int cityId, String cityName, int cityStateId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.cityStateId = cityStateId;
	}
	
	
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCityStateId() {
		return cityStateId;
	}

	public void setCityStateId(int cityStateId) {
		this.cityStateId = cityStateId;
	}



}
