package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Carreras;
import com.poo.adb.repository.CarrerasRepository;

@Service
public class CarrerasServices implements GenericServices<Carreras> {
	
	@Autowired
	private CarrerasRepository repository;

	@Override
	public Carreras save(Carreras object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Carreras update(Carreras object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Carreras findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Carreras object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Carreras> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
