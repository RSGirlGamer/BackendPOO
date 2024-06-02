package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
	
	Autor findByAutor(String autor);

}
