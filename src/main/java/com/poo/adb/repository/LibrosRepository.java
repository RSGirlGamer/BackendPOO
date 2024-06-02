package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Libros;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer> {

	
}
