package com.poo.adb.models;

import java.sql.Time;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("cd")
@Entity
public class Cds extends Materiales {
	
	@Column
	private Integer id_cd;
	
	@ManyToOne
	@JoinColumn
	private Categorias curso_id;
	
	@Column
	private Time duracion;
	
	@Column
	private Integer stock;
	
	@Column
	private String location;
	
}
