package com.example.demo.service.impl;

import static com.example.demo.utilidades.UtilEstudiante.obtenerEstudiantes;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.example.demo.model.EstudianteDTO;
import com.example.demo.service.EstudianteService;
import com.example.demo.utilidades.UtilEstudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Override
	public List<EstudianteDTO> listarEstudiante() {		
		return UtilEstudiante.obtenerEstudiantes();
	}

	@Override
	public EstudianteDTO buscarEstudianteImperativa(Integer identificacion) {
		List<EstudianteDTO> estudiantes =  obtenerEstudiantes();
		EstudianteDTO estudianteEncontrado = null;
		for(int i = 0; i < estudiantes.size(); i++) {
			EstudianteDTO estudianteEvaluar = estudiantes.get(i);
			if( Objects.equals(identificacion,  estudianteEvaluar.getIdentificacion())) {
				estudianteEncontrado =  estudianteEvaluar;
				break;
			}
		}
		
		if(estudianteEncontrado == null) {
			throw new IllegalArgumentException();
		}
		
		return estudianteEncontrado;
	}

	@Override
	public EstudianteDTO buscarEstudianteDeclarativa(Integer identificacion) {
		Predicate<EstudianteDTO> filtroPorIdentificacion = e -> Objects.equals(identificacion,  e.getIdentificacion());
		return obtenerEstudiantes().stream()
				.filter(filtroPorIdentificacion)
				.findFirst()
				.orElseThrow(IllegalArgumentException :: new);		
	}

	@Override
	public EstudianteDTO buscarEstudiante(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstudianteDTO buscarEstudianteCoincidencia(String coincidenciaNombre) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
