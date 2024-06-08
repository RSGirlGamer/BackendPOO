package com.poo.adb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poo.adb.models.MoraConfiguration;
import com.poo.adb.services.MoraConfigurationServices;

@RestController
@CrossOrigin(origins = "*")
public class MoraConfigurationController {
	
	@Autowired
	private MoraConfigurationServices service;
	
	@GetMapping("/moraConfigurations/moraConfiguration/{id}")
	public MoraConfiguration getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PutMapping("/moraConfigurations/moraConfiguration/update")
	public MoraConfiguration update(@RequestBody MoraConfiguration configuration) {
		return service.update(configuration);
	}
}
