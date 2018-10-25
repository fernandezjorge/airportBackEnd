package com.dxc.tddExample.domain;

public class Airport {

	private String airportCode;

	public Airport(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportCode() {
		return airportCode;
	}

	@Override
	public String toString() {
		return "Airport [airportCode=" + airportCode + "]";
	}

}
