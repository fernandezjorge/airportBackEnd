package com.dxc.tddExample.provider;

import java.util.*;

import org.springframework.stereotype.Component;

import com.dxc.tddExample.domain.Airport;

@Component
public class AirportProviderImpl implements AirportProvider {
	List<Airport> airports;

	public AirportProviderImpl() {

		this.airports = new ArrayList<Airport>();

		airports.add(new Airport("DFW"));
		airports.add(new Airport("NYC"));
		airports.add(new Airport("LAS"));
		airports.add(new Airport("LAX"));
		airports.add(new Airport("PHX"));
		airports.add(new Airport("BUE"));
		airports.add(new Airport("COR"));

	}

	@Override
	public List<Airport> getAllAirports() {
		return this.airports;
	}

}
