package com.bhavika.cd.contactDirectory.entity;

public class City {

	private int cityId;
	private String cityName;
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
