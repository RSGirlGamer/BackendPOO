package com.poo.adb.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "facultades")
public class Facultades {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer facultad_id;
	
	@Column
	private String facultad_name;
	
	@OneToMany(mappedBy = "facultad_id")
	private List<Carreras> carreras; 

}
