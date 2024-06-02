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

import com.poo.adb.models.Obras;
import com.poo.adb.services.ObrasServices;

@RestController
@CrossOrigin(origins = "*")
public class ObrasController {
	
	@Autowired
	private ObrasServices service;
	
	@GetMapping("/plays")
	public List<Obras> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/plays/play/{id}")
	public Obras getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/plays/play/save")
	public Obras save(@RequestBody Obras play) {
		return service.save(play);
	}
	
	@PutMapping("/plays/play/update")
	public Obras update(@RequestBody Obras play) {
		return service.update(play);
	}
	
	@DeleteMapping("/plays/play/delete")
	public void delete(@RequestBody Obras play) {
		service.delete(play);
	}
}
