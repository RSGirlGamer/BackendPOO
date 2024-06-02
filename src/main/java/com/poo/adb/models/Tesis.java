package com.poo.adb.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("tesis")
@Entity
public class Tesis extends Materiales {

	@Column
	private Integer id_tesis;
	
	@ManyToOne
	@JoinColumn
	private Categorias curso_id;
	
	@Column
	private Date fecha_publicacion;
	
	@Column
	private String ISBN;
	
	@Column
	private Integer stock;
	
	@Column
	private String location;
	
	@Column
	private Integer numero_paginas;
}
