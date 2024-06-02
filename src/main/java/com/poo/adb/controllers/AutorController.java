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

import com.poo.adb.models.Autor;
import com.poo.adb.services.AutorServices;

@RestController
@CrossOrigin(origins = "*")
public class AutorController {
	
	@Autowired
	private AutorServices service;
	
	@GetMapping("/authors")
	public List<Autor> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/authors/author/{id}")
	public Autor getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@GetMapping("/authors/author/name/{name}")
	public Autor getByName(@PathVariable String name) {
		return service.findByName(name);
	}
	
	@PostMapping("/authors/author/save")
	public Autor save(@RequestBody Autor author) {
		return service.save(author);
	}
	
	@PutMapping("/authors/author/update")
	public Autor update(@RequestBody Autor author) {
		return service.update(author);
	}
	
	@DeleteMapping("/authors/author/delete")
	public void delete(@RequestBody Autor author) {
		service.delete(author);
	}
}
