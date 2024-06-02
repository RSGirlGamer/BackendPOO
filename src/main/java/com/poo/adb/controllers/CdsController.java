package com.poo.adb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poo.adb.models.Cds;
import com.poo.adb.services.CdsServices;

@RestController
@CrossOrigin(origins = "*")
public class CdsController {
	
	@Autowired
	private CdsServices service;
	
	@GetMapping("/cds")
	public List<Cds> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/cds/cd/{id}")
	public Cds getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/cds/cd/save")
	public Cds save(@RequestBody Cds cd) {
		return service.save(cd);
	}
	
	@PutMapping("/cds/cd/update")
	public Cds update(@RequestBody Cds cd) {
		return service.update(cd);
	}
	
	@DeleteMapping("/cds/cd/delete")
	public void delete(@RequestBody Cds cd) {
		service.delete(cd);
	}
}
