package com.dxc.tddExample.services;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dxc.tddExample.domain.Airport;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirportSortServiceImplTest {


	@Test
	public void shouldSortAirportByCode() {
		/*
		ArrayList<Airport> airports = new ArrayList<Airport>();

		airports.add(new Airport("LAS"));
		airports.add(new Airport("DFW"));
		airports.add(new Airport("NYC"));
		airports.add(new Airport("LAX"));
		airports.add(new Airport("BUE"));
		airports.add(new Airport("PHX"));
		airports.add(new Airport("COR"));

		Collections.sort(airports, airportSortService);
		*/
	}
}
