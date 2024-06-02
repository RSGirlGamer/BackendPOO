package com.poo.adb.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "prestamos")
public class Prestamos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_prestamo;
	
	@ManyToOne
	@JoinColumn
	private Users user_id;
	
	@ManyToOne
	@JoinColumn
	private Materiales material_id;
	
	@Column
	private Date fecha_prestamo;
	
	@Column
	private Date fecha_devolucion;
	
	@Column
	private String estado;
		
}
