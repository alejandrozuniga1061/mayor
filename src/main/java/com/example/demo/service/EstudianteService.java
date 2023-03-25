package com.example.demo.service;

import java.util.List;

import com.example.demo.model.EstudianteDTO;

public interface EstudianteService {

	List<EstudianteDTO> listarEstudiante();
	
	EstudianteDTO buscarEstudianteImperativa(Integer identificacion);
	
	EstudianteDTO buscarEstudianteDeclarativa(Integer identificacion);
	
	EstudianteDTO buscarEstudiante(String nombre);
	
	/**
	 * Método que se encarga de obtener un estudiante cuyo nombre concuerde con el parámetro
	 * Ejemplo: Si el estudiante se llama Alejandro y envía una coincidencia 'ale' debe retornar
	 * el estudiante
	 * @param coincidenciaNombre
	 * @return
	 */
	EstudianteDTO buscarEstudianteCoincidencia(String coincidenciaNombre); 
	
}
