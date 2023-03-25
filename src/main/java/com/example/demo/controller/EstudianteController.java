package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EstudianteDTO;
import com.example.demo.service.EstudianteService;

@RestController
@RequestMapping("estudiantes")
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;

	@GetMapping(path = "salon")
	public List<EstudianteDTO> consultarEstudiantes(){
		return estudianteService.listarEstudiante();
	}
	
	@GetMapping(path = "impertativa/{identificacion}")
	public EstudianteDTO buscarEstudiante(@PathVariable Integer identificacion){
		return estudianteService.buscarEstudianteImperativa(identificacion);
	}
	
	@GetMapping(path = "declarativa/{identificacion}")
	public EstudianteDTO buscarEstudianteDeclarativa(@PathVariable Integer identificacion){
		return estudianteService.buscarEstudianteDeclarativa(identificacion);
	}
	
}
