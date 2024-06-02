package com.poo.adb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.adb.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	
}
