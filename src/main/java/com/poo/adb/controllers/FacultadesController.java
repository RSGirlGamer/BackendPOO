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

import com.poo.adb.models.Facultades;
import com.poo.adb.services.FacultadesServices;

@RestController
@CrossOrigin(origins = "*")
public class FacultadesController {
	
	@Autowired
	private FacultadesServices service;
	
	@GetMapping("/faculties")
	public List<Facultades> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/faculties/faculty/{id}")
	public Facultades getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/faculties/faculty/save")
	public Facultades save(@RequestBody Facultades faculty) {
		return service.save(faculty);
	}
	
	@PutMapping("/faculties/faculty/update")
	public Facultades update(@RequestBody Facultades faculty) {
		return service.update(faculty);
	}
	
	@DeleteMapping("/faculties/faculty/delete")
	public void delete(@RequestBody Facultades faculty) {
		service.delete(faculty);
	}
}
