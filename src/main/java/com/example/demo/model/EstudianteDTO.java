package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.controller.EstudianteController;

public class EstudianteDTO {

	private String nombre;
	private Long edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getEdad() {
		return edad;
	}

	public void setEdad(Long edad) {
		this.edad = edad;
	}



}
