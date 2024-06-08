package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.BorrowConfiguration;
import com.poo.adb.repository.BorrowConfigurationRepository;

@Service
public class BorrowConfigurationServices implements GenericServices<BorrowConfiguration> {
	
	@Autowired
	private BorrowConfigurationRepository repository;

	@Override
	public BorrowConfiguration save(BorrowConfiguration object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public BorrowConfiguration update(BorrowConfiguration object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public BorrowConfiguration findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(BorrowConfiguration object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<BorrowConfiguration> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
