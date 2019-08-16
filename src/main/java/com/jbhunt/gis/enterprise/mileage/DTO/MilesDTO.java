package com.jbhunt.gis.enterprise.mileage.DTO;

public class MilesDTO {

	private String miles;
	private String tolls;

	public MilesDTO(String miles, String tolls) {
		super();
		this.miles = miles;
		this.tolls = tolls;
	}

	public String getMiles() {
		return miles;
	}

	public void setMiles(String miles) {
		this.miles = miles;
	}

	public String getTolls() {
		return tolls;
	}

	public void setTolls(String tolls) {
		this.tolls = tolls;
	}

}
