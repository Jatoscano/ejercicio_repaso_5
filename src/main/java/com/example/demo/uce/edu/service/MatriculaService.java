package com.example.demo.uce.edu.service;

import java.util.List;

import com.example.demo.uce.edu.repository.model.Matricula;
import com.example.demo.uce.edu.repository.model.dto.MatriculaDTO;

public interface MatriculaService {

	public void registrar(Matricula matricula);
	public void guardar(Matricula matricula);
	public Matricula buscar(Integer id);
	public void borrar(Integer id);
	
	public void registrarMatricula(String cedula, String codigo); 
	public List<MatriculaDTO> reporteMatriculas(String cedula, String nombreEstudiante, String apellido, 
			   String nombreMateria, String codigo);
}
