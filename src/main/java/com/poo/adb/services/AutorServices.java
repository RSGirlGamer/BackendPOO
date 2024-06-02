package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Autor;
import com.poo.adb.repository.AutorRepository;

@Service
public class AutorServices implements GenericServices<Autor> {
	
	@Autowired
	private AutorRepository repository;

	@Override
	public Autor save(Autor object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Autor update(Autor object) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(object);
	}

	@Override
	public Autor findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Autor object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Autor> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	public Autor findByName(String name) {
		return repository.findByAutor(name);
	}

	
}
