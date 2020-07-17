/**
 * 
 */
package com.nxpert.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpert.entity.Country;
import com.nxpert.repository.CountryRepository;

@RestController
public class CountryController {

	protected Logger logger = Logger
			.getLogger(CountryController.class.getName());
	
	@Autowired
	CountryRepository contryRepository;
	

	@RequestMapping("/country/{id}")
	public Country byId(@PathVariable("id") Long id) {
		logger.info("country-microservice byId() invoked: " + id);
		Country country = contryRepository.findOne(id);
		logger.info("country-microservice byId() found: " + country);
		return country;
	}
	
	@RequestMapping("/country")
	public List<Country> All() {
		List<Country> countryAll = contryRepository.findAll();
		return countryAll;
	}
}
