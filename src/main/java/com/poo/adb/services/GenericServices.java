package com.poo.adb.services;

import java.util.List;

public interface GenericServices<T> {

	T save(T object);
	
	T update(T object);
	
	T findByID(Integer id);
	
	void delete(T object);
	
	List<T> findAll();
	
}
