package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Revistas;

@Repository
public interface RevistasRepository extends JpaRepository<Revistas, Integer> {

	
}
