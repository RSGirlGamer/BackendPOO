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

import com.poo.adb.models.Prestamos;
import com.poo.adb.services.PrestamosServices;

@RestController
@CrossOrigin(origins = "*")
public class PrestamosController {
	
	@Autowired
	private PrestamosServices service;
	
	@GetMapping("/borrows")
	public List<Prestamos> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/borrows/borrow/{id}")
	public Prestamos getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/borrows/borrow/save")
	public Prestamos save(@RequestBody Prestamos borrow) {
		return service.save(borrow);
	}
	
	@PutMapping("/borrows/borrow/update")
	public Prestamos update(@RequestBody Prestamos borrow) {
		return service.update(borrow);
	}
	
	@DeleteMapping("/borrows/borrow/delete")
	public void delete(@RequestBody Prestamos borrow) {
		service.delete(borrow);
	}
}
