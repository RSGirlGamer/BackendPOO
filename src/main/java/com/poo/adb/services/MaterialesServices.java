package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Materiales;
import com.poo.adb.repository.MaterialesRepository;

@Service
public class MaterialesServices implements GenericServices<Materiales> {
	
	@Autowired
	private MaterialesRepository repository;

	@Override
	public Materiales save(Materiales object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Materiales update(Materiales object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Materiales findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Materiales object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Materiales> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
