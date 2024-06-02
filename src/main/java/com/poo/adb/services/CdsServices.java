package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Cds;
import com.poo.adb.repository.CdsRepository;

@Service
public class CdsServices implements GenericServices<Cds> {
	
	@Autowired
	private CdsRepository repository;

	@Override
	public Cds save(Cds object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Cds update(Cds object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Cds findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Cds object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Cds> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
