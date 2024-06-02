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

import com.poo.adb.models.Carreras;
import com.poo.adb.services.CarrerasServices;

@RestController
@CrossOrigin(origins = "*")
public class CarrerasController {
	
	@Autowired
	private CarrerasServices service;
	
	@GetMapping("/majors")
	public List<Carreras> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/majors/major/{id}")
	public Carreras getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/majors/major/save")
	public Carreras save(@RequestBody Carreras majors) {
		return service.save(majors);
	}
	
	@PutMapping("/majors/major/update")
	public Carreras update(@RequestBody Carreras major) {
		return service.update(major);
	}
	
	@DeleteMapping("/majors/major/delete")
	public void delete(@RequestBody Carreras major) {
		service.delete(major);
	}
}
