package com.cmepps.dotareas.driven_adapter.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity

public class TaskEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "duracion")
	private String duracion;
	
	@Column(name = "prioridad")
	private String prioridad;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_limite")
	private String fechaLimite;
	
	@Column(name = "is_completed")
	private boolean isCompleted;
}
