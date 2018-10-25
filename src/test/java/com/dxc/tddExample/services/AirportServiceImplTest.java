package com.dxc.tddExample.services;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.dxc.tddExample.domain.*;
import com.dxc.tddExample.provider.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirportServiceImplTest {

	
	@Autowired
	private AirportServiceImpl airportSearchService;
	
	@Test	
	public void shouldReturnAirport() {
		String searchValue = "DFW";
		assertNotNull(airportSearchService.searchByAirportCode(searchValue));
	}
	
	@Test	
	public void shouldNotReturnAirport() {
		String searchValue = "AAA";
		assertNull(airportSearchService.searchByAirportCode(searchValue));
	}

}
