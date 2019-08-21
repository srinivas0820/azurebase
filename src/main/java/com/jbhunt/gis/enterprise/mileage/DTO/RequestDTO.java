package com.jbhunt.gis.enterprise.mileage.DTO;

public class RequestDTO {

	private String originStopType;

	private String originStop;

	private String originCountry;

	private String destinationStopType;

	private String destinationStop;

	private String destinationCountry;

	public RequestDTO() {
	}

	public String getOriginStopType() {
		return originStopType;
	}

	public void setOriginStopType(String originStopType) {
		this.originStopType = originStopType;
	}

	public String getOriginStop() {
		return originStop;
	}

	public void setOriginStop(String originStop) {
		this.originStop = originStop;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public String getDestinationStopType() {
		return destinationStopType;
	}

	public void setDestinationStopType(String destinationStopType) {
		this.destinationStopType = destinationStopType;
	}

	public String getDestinationStop() {
		return destinationStop;
	}

	public void setDestinationStop(String destinationStop) {
		this.destinationStop = destinationStop;
	}

	public String getDestinationCountry() {
		return destinationCountry;
	}

	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}

	@Override
	public String toString() {
		return "{originStopType=" + originStopType + ", originStop=" + originStop + ", originCountry="
				+ originCountry + ", destinationStopType=" + destinationStopType + ", destinationStop="
				+ destinationStop + ", destinationCountry=" + destinationCountry + "}";
	}

}
