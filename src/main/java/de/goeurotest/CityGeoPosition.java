package de.goeurotest;

import com.fasterxml.jackson.annotation.JsonGetter;

public class CityGeoPosition {

	public CityGeoPosition() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String latitude;
	private String longitude;

	public CityGeoPosition(String latitude, String longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@JsonGetter("latitude")
	public String getLatitude() {
		return latitude;
	}

	@JsonGetter("longitude")
	public String getLongitude() {
		return longitude;
	}
}
