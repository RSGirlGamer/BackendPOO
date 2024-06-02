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

import com.poo.adb.models.Mora;
import com.poo.adb.services.MoraServices;

@RestController
@CrossOrigin(origins = "*")
public class MoraController {
	
	@Autowired
	private MoraServices service;
	
	@GetMapping("/moras")
	public List<Mora> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/moras/mora/{id}")
	public Mora getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/moras/mora/save")
	public Mora save(@RequestBody Mora mora) {
		return service.save(mora);
	}
	
	@PutMapping("/moras/mora/update")
	public Mora update(@RequestBody Mora mora) {
		return service.update(mora);
	}
	
	@DeleteMapping("/moras/mora/delete")
	public void delete(@RequestBody Mora mora) {
		service.delete(mora);
	}
}
