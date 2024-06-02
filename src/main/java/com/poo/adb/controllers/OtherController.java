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

import com.poo.adb.models.Other;
import com.poo.adb.services.OtherServices;

@RestController
@CrossOrigin(origins = "*")
public class OtherController {
	
	@Autowired
	private OtherServices service;
	
	@GetMapping("/others")
	public List<Other> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/others/other/{id}")
	public Other getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/others/other/save")
	public Other save(@RequestBody Other play) {
		return service.save(play);
	}
	
	@PutMapping("/others/other/update")
	public Other update(@RequestBody Other play) {
		return service.update(play);
	}
	
	@DeleteMapping("/others/other/delete")
	public void delete(@RequestBody Other play) {
		service.delete(play);
	}
}
