package com.example.demo.utilidades;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.EstudianteDTO;

public class UtilEstudiante {
	
	private UtilEstudiante() {
		throw new IllegalAccessError();
	}

	
	public static final List<EstudianteDTO> obtenerEstudiantes() {
				
		EstudianteDTO estudiante1 = new EstudianteDTO();
		estudiante1.setEdad(10);
		estudiante1.setNombre("Alejandro");
		estudiante1.setIdentificacion(1);
		
		EstudianteDTO estudiante2 = new EstudianteDTO();
		estudiante2.setEdad(15);
		estudiante2.setNombre("Pepito");
		estudiante2.setIdentificacion(2);
		
		EstudianteDTO estudiante3 = new EstudianteDTO();
		estudiante3.setEdad(16);
		estudiante3.setNombre("Juanito");
		estudiante3.setIdentificacion(3);
		
		List<EstudianteDTO> estudiantes = new ArrayList<>();
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);
		return estudiantes;
	}
	
}
