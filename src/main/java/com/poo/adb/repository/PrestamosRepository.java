package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Prestamos;

@Repository
public interface PrestamosRepository extends JpaRepository<Prestamos, Integer> {

	
}
