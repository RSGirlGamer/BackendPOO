package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.UserDetails;
import com.poo.adb.repository.UserDetailsRepository;

@Service
public class UserDetailsServices implements GenericServices<UserDetails> {
	
	@Autowired
	private UserDetailsRepository repository;

	@Override
	public UserDetails save(UserDetails object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public UserDetails update(UserDetails object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public UserDetails findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(UserDetails object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<UserDetails> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
