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

import com.poo.adb.models.Libros;
import com.poo.adb.services.LibrosServices;

@RestController
@CrossOrigin(origins = "*")
public class LibrosController {
	
	@Autowired
	private LibrosServices service;
	
	@GetMapping("/books")
	public List<Libros> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/books/book/{id}")
	public Libros getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/books/book/save")
	public Libros save(@RequestBody Libros book) {
		return service.save(book);
	}
	
	@PutMapping("/books/book/update")
	public Libros update(@RequestBody Libros book) {
		return service.update(book);
	}
	
	@DeleteMapping("/books/book/delete")
	public void delete(@RequestBody Libros book) {
		service.delete(book);
	}
}
