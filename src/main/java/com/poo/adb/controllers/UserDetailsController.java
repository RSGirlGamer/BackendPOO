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

import com.poo.adb.models.UserDetails;
import com.poo.adb.services.UserDetailsServices;

@RestController
@CrossOrigin(origins = "*")
public class UserDetailsController {
	
	@Autowired
	private UserDetailsServices service;
	
	@GetMapping("/userdetails")
	public List<UserDetails> getAll() {
		return service.findAll();
	}
	
	@GetMapping("/userdetails/userdetail/{id}")
	public UserDetails getByID(@PathVariable Integer id) {
		return service.findByID(id);
	}
	
	@PostMapping("/userdetails/userdetail/save")
	public UserDetails save(@RequestBody UserDetails userdetail) {
		return service.save(userdetail);
	}
	
	@PutMapping("/userdetails/userdetail/update")
	public UserDetails update(@RequestBody UserDetails userdetail) {
		return service.update(userdetail);
	}
	
	@DeleteMapping("/userdetails/userdetail/delete")
	public void delete(@RequestBody UserDetails userdetail) {
		service.delete(userdetail);
	}
}
