package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.MoraConfiguration;

@Repository
public interface MoraConfigurationRepository extends JpaRepository<MoraConfiguration, Integer> {

}
