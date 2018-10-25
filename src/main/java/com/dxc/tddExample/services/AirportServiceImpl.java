package com.dxc.tddExample.services;

import java.util.*;

import org.springframework.http.*;
import org.springframework.stereotype.Service;

import com.dxc.tddExample.domain.Airport;
import com.dxc.tddExample.provider.AirportProvider;

@Service("airportService")
public class AirportServiceImpl implements AirportService, Comparator<Airport> {

	private AirportProvider airportProvider;
	private HttpHeaders headers;

	public AirportServiceImpl(AirportProvider provider) {
		this.airportProvider = provider;
	}

	@Override
	public ResponseEntity<Airport> searchByAirportCode(String airportCode) {

		headers = new HttpHeaders();

		if (isNullOrEmptyAirportList()) {
			headers.add("AirportListNullOrEmpty", "AirportListNullOrEmpty");
			return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).headers(headers).body(null);
		} else {
			for (Airport air : airportProvider.getAllAirports()) {
				if (air.getAirportCode().equals(airportCode)) {
					return ResponseEntity.ok(air);
				}
			}
			headers.add("AirportNotFound", "AirportNotFound");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(headers).body(null);
		}
	}

	@Override
	public ResponseEntity<List<Airport>> getAllAirports() {
		headers = new HttpHeaders();

		if (isNullOrEmptyAirportList()) {
			headers.add("AirportListNullOrEmpty", "AirportListNullOrEmpty");
			return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).headers(headers).body(null);
		} else {
			Collections.sort(airportProvider.getAllAirports(), new AirportServiceImpl(airportProvider));
			return ResponseEntity.ok(airportProvider.getAllAirports());
		}
	}

	@Override
	public List<Airport> sortByAirportCode() {
		Collections.sort(airportProvider.getAllAirports(), new AirportServiceImpl(airportProvider));
		return airportProvider.getAllAirports();
	}

	@Override
	public int compare(Airport o1, Airport o2) {
		return o1.getAirportCode().compareTo(o2.getAirportCode());
	}

	@Override
	public Boolean isNullOrEmptyAirportList() {
		if ((airportProvider.getAllAirports() == null) || (airportProvider.getAllAirports().size() < 1)) {
			return true;
		} else {
			return false;
		}
	}

}