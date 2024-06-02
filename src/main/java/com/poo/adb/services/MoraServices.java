package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Mora;
import com.poo.adb.repository.MoraRepository;

@Service
public class MoraServices implements GenericServices<Mora> {
	
	@Autowired
	private MoraRepository repository;

	@Override
	public Mora save(Mora object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Mora update(Mora object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Mora findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Mora object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Mora> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
