package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Obras;
import com.poo.adb.repository.ObrasRepository;

@Service
public class ObrasServices implements GenericServices<Obras> {
	
	@Autowired
	private ObrasRepository repository;

	@Override
	public Obras save(Obras object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Obras update(Obras object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Obras findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Obras object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Obras> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
