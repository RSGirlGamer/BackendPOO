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

import com.poo.adb.models.Users;
import com.poo.adb.services.UsersServices;

@RestController
@CrossOrigin(origins = "*")
public class UsersController {
	
	@Autowired
	private UsersServices service;
	
	@GetMapping("/users")
	public List<Users> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/users/user/{id}")
	public Users getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/users/user/save")
	public Users save(@RequestBody Users user) {
		return service.save(user);
	}
	
	@PutMapping("/users/user/update")
	public Users update(@RequestBody Users user) {
		return service.update(user);
	}
	
	@DeleteMapping("/users/user/delete")
	public void delete(@RequestBody Users user) {
		service.delete(user);
	}
}
