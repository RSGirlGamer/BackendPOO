package com.poo.adb.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("tesis")
@Entity
@PrimaryKeyJoinColumn(name = "id_tesis", referencedColumnName = "id_material")
public class Tesis extends Materiales {
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Categorias curso_id;
	
	@Column
	private Date fecha_publicacion;
	
	@Column
	private Integer stock;
	
	@Column
	private String location;
	
	@Column
	private Integer numero_paginas;
}
