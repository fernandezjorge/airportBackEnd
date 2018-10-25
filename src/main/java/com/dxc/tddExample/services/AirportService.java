package com.dxc.tddExample.services;

import java.util.*;

import org.springframework.http.ResponseEntity;

import com.dxc.tddExample.domain.Airport;

public interface AirportService {
	
	ResponseEntity<Airport> searchByAirportCode(String airportCode);

	ResponseEntity<?> getAllAirports();

	List<Airport> sortByAirportCode();
	
	Boolean isNullOrEmptyAirportList();
}
