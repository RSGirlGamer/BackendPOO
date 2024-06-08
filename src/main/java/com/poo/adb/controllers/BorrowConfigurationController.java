package com.poo.adb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poo.adb.models.BorrowConfiguration;
import com.poo.adb.services.BorrowConfigurationServices;

@RestController
@CrossOrigin(origins = "*")
public class BorrowConfigurationController {
	
	@Autowired
	private BorrowConfigurationServices service;
	
	@GetMapping("/borrowConfigurations/borrowConfiguration/{id}")
	public BorrowConfiguration getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PutMapping("/borrowConfigurations/borrowConfiguration/update")
	public BorrowConfiguration update(@RequestBody BorrowConfiguration configuration) {
		return service.update(configuration);
	}
}
