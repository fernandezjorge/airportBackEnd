package com.dxc.tddExample.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dxc.tddExample.domain.Airport;
import com.dxc.tddExample.provider.*;
import com.dxc.tddExample.services.*;

@RestController
@RequestMapping("/backEnd")
public class AirportController {

	private AirportService svc = new AirportServiceImpl(new AirportProviderImpl());

	@RequestMapping("/all")
	private ResponseEntity<?> showAllSortAirports() {
		return svc.getAllAirports();
	}

	@RequestMapping(value = "/search")
	private ResponseEntity<Airport> searchAirport(
			@RequestParam(value = "searchValue", required = false) String airCode) {
		return svc.searchByAirportCode(airCode);
	}

}
