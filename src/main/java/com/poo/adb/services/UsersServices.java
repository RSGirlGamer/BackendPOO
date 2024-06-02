package com.poo.adb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.adb.models.Users;
import com.poo.adb.repository.UserRepository;

@Service
public class UsersServices implements GenericServices<Users> {
	
	@Autowired
	private UserRepository repository;

	@Override
	public Users save(Users object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Users update(Users object) {
		// TODO Auto-generated method stub
		return repository.save(object);
	}

	@Override
	public Users findByID(Integer id) {
		// TODO Auto-generated method stub
		return repository.getReferenceById(id);
	}

	@Override
	public void delete(Users object) {
		// TODO Auto-generated method stub
		repository.delete(object);
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
