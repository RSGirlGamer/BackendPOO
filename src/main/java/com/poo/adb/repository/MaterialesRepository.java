package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Materiales;

@Repository
public interface MaterialesRepository extends JpaRepository<Materiales, Integer> {

	
}
