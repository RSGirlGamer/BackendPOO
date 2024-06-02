package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {

	
}
