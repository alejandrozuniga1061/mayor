package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.EstudianteDTO;
import com.example.demo.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Override
	public List<EstudianteDTO> listarEstudiante() {
		EstudianteDTO estudiante = new EstudianteDTO();
		estudiante.setEdad(1L);
		estudiante.setNombre("Alejandro");
		
		List<EstudianteDTO> estudiantes = new ArrayList<>();
		estudiantes.add(estudiante);
		return estudiantes;
	}
	
}
