package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Prestamos;
import com.poo.adb.repository.PrestamosRepository;

@Service
public class PrestamosServices implements GenericServices<Prestamos> {
	
	@Autowired
	private PrestamosRepository repository;

	@Override
	public Prestamos save(Prestamos object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Prestamos update(Prestamos object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Prestamos findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Prestamos object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Prestamos> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
