package com.gsd.daw.prog;

import java.util.Arrays;

public class Empleado {
	private String nombre;
	private String dni;
	private int salario;
	private String titulos;

	public Empleado(String nombre, String dni, int salario, String titulos) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
		this.titulos = titulos;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getTitulos() {
		return titulos;
	}
	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	
	
	
}
