package com.dxc.tddExample.controllers;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.dxc.tddExample.provider.AirportProviderImpl;
import com.dxc.tddExample.services.AirportServiceImpl;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class AirportControllerTest {
		
	private AirportProviderImpl airportProviderImpl = new AirportProviderImpl();
	
	@Autowired
	private AirportServiceImpl airportSearchService;
		
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void searchAirportReturnTrue() throws Exception {
		
		mockMvc.perform(get("/airports/sort")).andDo(print()).andExpect(status().isOk());	
	}

}
