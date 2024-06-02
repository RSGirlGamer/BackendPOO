package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Cds;

@Repository
public interface CdsRepository extends JpaRepository<Cds, Integer> {

	
}
