package com.example.demo.uce.edu.repository.model.dto;

public class MatriculaDTO {

	private String cedula;
	private String nombreEstudiante;
	private String apellido;
	private String nombreMateria;
	private String codigo;
	
	//Constructor por Defecto
	public MatriculaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public MatriculaDTO(String cedula, String nombreEstudiante, String apellido, String nombreMateria, String codigo) {
		this.cedula = cedula;
		this.nombreEstudiante = nombreEstudiante;
		this.apellido = apellido;
		this.nombreMateria = nombreMateria;
		this.codigo = codigo;
	}

	//To String
	@Override
	public String toString() {
		return "MatriculaDTO [cedula=" + cedula + ", nombreEstudiante=" + nombreEstudiante + ", apellido=" + apellido
				+ ", nombreMateria=" + nombreMateria + ", codigo=" + codigo + "]";
	}

	//Get and Set
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
