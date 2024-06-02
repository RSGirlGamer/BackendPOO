package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Tesis;
import com.poo.adb.repository.TesisRepository;

@Service
public class TesisServices implements GenericServices<Tesis> {
	
	@Autowired
	private TesisRepository repository;

	@Override
	public Tesis save(Tesis object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Tesis update(Tesis object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Tesis findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Tesis object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Tesis> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
