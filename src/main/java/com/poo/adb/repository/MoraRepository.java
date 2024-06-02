package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Mora;

@Repository
public interface MoraRepository extends JpaRepository<Mora, Integer> {

	
}
