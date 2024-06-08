package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.BorrowConfiguration;

@Repository
public interface BorrowConfigurationRepository extends JpaRepository<BorrowConfiguration, Integer> {

}
