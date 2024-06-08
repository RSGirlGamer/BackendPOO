package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.MoraConfiguration;
import com.poo.adb.repository.MoraConfigurationRepository;

@Service
public class MoraConfigurationServices implements GenericServices<MoraConfiguration> {
	
	@Autowired
	private MoraConfigurationRepository repository;

	@Override
	public MoraConfiguration save(MoraConfiguration object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public MoraConfiguration update(MoraConfiguration object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public MoraConfiguration findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(MoraConfiguration object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<MoraConfiguration> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
