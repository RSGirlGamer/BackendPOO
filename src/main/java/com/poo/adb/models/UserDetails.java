package com.poo.adb.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_details")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer user_detail_id;
	
	@Column
	private String name;
	
	@Column
	private String last_name;
	
	@ManyToOne
	@JoinColumn(name = "facultad_id")
	private Facultades facultad_id;
	
	@Column
	private Date created_at;
	
	@Column
	private String email;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private Users user_id;

}
