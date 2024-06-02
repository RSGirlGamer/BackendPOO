package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Carreras;

@Repository
public interface CarrerasRepository extends JpaRepository<Carreras, Integer> {

}
