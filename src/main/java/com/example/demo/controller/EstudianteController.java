package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping(path = "salon2")
	public ResponseEntity<List<EstudianteDTO>> consultarEstudiantes2(){
		return ResponseEntity.ok().body(estudianteService.listarEstudiante());
	}
	
}
