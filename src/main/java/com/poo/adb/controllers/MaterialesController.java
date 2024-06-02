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

import com.poo.adb.models.Materiales;
import com.poo.adb.services.MaterialesServices;

@RestController
@CrossOrigin(origins = "*")
public class MaterialesController {
	
	@Autowired
	private MaterialesServices service;
	
	@GetMapping("/materials")
	public List<Materiales> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/materials/material/{id}")
	public Materiales getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/materials/material/save")
	public Materiales save(@RequestBody Materiales material) {
		return service.save(material);
	}
	
	@PutMapping("/materials/material/update")
	public Materiales update(@RequestBody Materiales material) {
		return service.update(material);
	}
	
	@DeleteMapping("/materials/material/delete")
	public void delete(@RequestBody Materiales material) {
		service.delete(material);
	}
}
