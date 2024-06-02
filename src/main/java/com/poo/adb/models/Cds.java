package com.poo.adb.models;

import java.sql.Time;
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
@DiscriminatorValue("cd")
@Entity
@PrimaryKeyJoinColumn(name = "id_cd", referencedColumnName = "id_material")
public class Cds extends Materiales {
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Categorias curso_id;
	
	@Column
	private Time duracion;
	
	@Column
	private Integer stock;
	
	@Column
	private String location;
	
}
