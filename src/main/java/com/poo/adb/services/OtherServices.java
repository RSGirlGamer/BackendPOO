package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Other;
import com.poo.adb.repository.OtherRepository;

@Service
public class OtherServices implements GenericServices<Other> {
	
	@Autowired
	private OtherRepository repository;

	@Override
	public Other save(Other object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Other update(Other object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Other findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Other object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Other> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
