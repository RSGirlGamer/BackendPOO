package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Categorias;
import com.poo.adb.repository.CategoriasRepository;

@Service
public class CategoriasServices implements GenericServices<Categorias> {
	
	@Autowired
	private CategoriasRepository repository;

	@Override
	public Categorias save(Categorias object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Categorias update(Categorias object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Categorias findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Categorias object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Categorias> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
