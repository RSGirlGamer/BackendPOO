package com.poo.adb.models;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("otros")
@Entity
public class Other extends Materiales {

	@Column
	private Integer id_other;
	
	@ManyToOne
	@JoinColumn
	private Categorias curso_id;
	
	@Column
	private Integer stock;
	
	@Column
	private String location;
	
}
