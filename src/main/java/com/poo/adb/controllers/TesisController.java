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

import com.poo.adb.models.Tesis;
import com.poo.adb.services.TesisServices;

@RestController
@CrossOrigin(origins = "*")
public class TesisController {
	
	@Autowired
	private TesisServices service;
	
	@GetMapping("/thesiss")
	public List<Tesis> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/thesiss/thesis/{id}")
	public Tesis getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/thesiss/thesis/save")
	public Tesis save(@RequestBody Tesis thesis) {
		return service.save(thesis);
	}
	
	@PutMapping("/thesiss/thesis/update")
	public Tesis update(@RequestBody Tesis thesis) {
		return service.update(thesis);
	}
	
	@DeleteMapping("/thesiss/thesis/delete")
	public void delete(@RequestBody Tesis thesis) {
		service.delete(thesis);
	}
}
