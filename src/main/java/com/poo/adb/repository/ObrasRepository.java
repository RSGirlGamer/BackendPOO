package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Obras;

@Repository
public interface ObrasRepository extends JpaRepository<Obras, Integer> {

	
}
