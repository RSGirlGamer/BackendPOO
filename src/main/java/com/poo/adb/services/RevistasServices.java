package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Revistas;
import com.poo.adb.repository.RevistasRepository;

@Service
public class RevistasServices implements GenericServices<Revistas> {
	
	@Autowired
	private RevistasRepository repository;

	@Override
	public Revistas save(Revistas object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Revistas update(Revistas object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Revistas findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Revistas object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Revistas> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
