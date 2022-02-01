package com.ejemplo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name = "uuid", strategy= "uuid2")
	private String id;
	
	private String nombre;
	private String email;
	private Integer prioridad;
	
	
	//getters y setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}
}