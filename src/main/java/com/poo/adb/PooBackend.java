package com.poo.adb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication(scanBasePackages = "com.poo.adb")
//@ComponentScan("com.poo.adb")
//@EntityScan("com.poo.adb.models")
public class PooBackend {

	public static void main(String[] args) {
		SpringApplication.run(PooBackend.class, args);
	}

}
