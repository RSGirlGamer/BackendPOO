package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Libros;
import com.poo.adb.repository.LibrosRepository;

@Service
public class LibrosServices implements GenericServices<Libros> {
	
	@Autowired
	private LibrosRepository repository;

	@Override
	public Libros save(Libros object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Libros update(Libros object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Libros findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Libros object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Libros> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
