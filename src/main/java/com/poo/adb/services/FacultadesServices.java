package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Facultades;
import com.poo.adb.repository.FacultadesRepository;

@Service
public class FacultadesServices implements GenericServices<Facultades> {
	
	@Autowired
	private FacultadesRepository repository;

	@Override
	public Facultades save(Facultades object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Facultades update(Facultades object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Facultades findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Facultades object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Facultades> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
