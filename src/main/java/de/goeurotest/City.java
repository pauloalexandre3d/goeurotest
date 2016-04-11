package de.goeurotest;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "key", "fullName", "iata_airport_code", "country", "locationId", "inEurope", "countryCode", "coreCountry", "distance" })
public class City {
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(String id, String name, String type, CityGeoPosition geoPosition){
		this.id = id;
		this.name = name;
		this.type = type;
		this.geoPosition = geoPosition;
	}

	private String id;
	private String name;
	private String type;
	private CityGeoPosition geoPosition;

	@JsonGetter("_id")
	public String getId() {
		return id;
	}

	@JsonGetter("name")
	public String getName() {
		return name;
	}

	@JsonGetter("type")
	public String getType() {
		return type;
	}

	@JsonGetter("geo_position")
	public CityGeoPosition getGeoPosition() {
		return geoPosition;
	}

	@Override
	public String toString() {
		return String.join(",", this.id, this.name, this.type, this.geoPosition.getLatitude(), this.getGeoPosition().getLongitude());
	}
	
	

}
