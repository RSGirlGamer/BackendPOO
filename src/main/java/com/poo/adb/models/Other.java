package com.poo.adb.models;

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
@DiscriminatorValue("otros")
@Entity
@PrimaryKeyJoinColumn(name = "id_other", referencedColumnName = "id_material")
public class Other extends Materiales {
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Categorias curso_id;
	
	@Column
	private Integer stock;
	
	@Column
	private String location;
	
}
