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

import com.poo.adb.models.Revistas;
import com.poo.adb.services.RevistasServices;

@RestController
@CrossOrigin(origins = "*")
public class RevistasController {
	
	@Autowired
	private RevistasServices service;
	
	@GetMapping("/magazines")
	public List<Revistas> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/magazines/magazine/{id}")
	public Revistas getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/magazines/magazine/save")
	public Revistas save(@RequestBody Revistas magazine) {
		return service.save(magazine);
	}
	
	@PutMapping("/magazines/magazine/update")
	public Revistas update(@RequestBody Revistas magazine) {
		return service.update(magazine);
	}
	
	@DeleteMapping("/magazines/magazine/delete")
	public void delete(@RequestBody Revistas magazine) {
		service.delete(magazine);
	}
}
