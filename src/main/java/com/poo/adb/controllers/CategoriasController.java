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

import com.poo.adb.models.Categorias;
import com.poo.adb.services.CategoriasServices;

@RestController
@CrossOrigin(origins = "*")
public class CategoriasController {
	
	@Autowired
	private CategoriasServices service;
	
	@GetMapping("/categories")
	public List<Categorias> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/categories/category/{id}")
	public Categorias getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/categories/category/save")
	public Categorias save(@RequestBody Categorias category) {
		return service.save(category);
	}
	
	@PutMapping("/categories/category/update")
	public Categorias update(@RequestBody Categorias category) {
		return service.update(category);
	}
	
	@DeleteMapping("/categories/category/delete")
	public void delete(@RequestBody Categorias category) {
		service.delete(category);
	}
}
