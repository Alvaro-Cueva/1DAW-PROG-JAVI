package com.gsd.daw.prog;
import java.util.ArrayList;
import java.util.List;
public class Empleado {
	private String nombre;
	private String dni;
	private double salario;
	private List<String> titulos;
	public Empleado(String nombre, String dni, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
		this.titulos = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public List<String> getTitulos() {
		return titulos;
	} 
	public void agregarTitulo(String titulo) {
		this.titulos.add(titulo);
	}
	@Override
	public String toString() {
		return "Empleado{" + "nombre='" + nombre + '\'' + ", dni='" + dni + '\'' + ", salario=" + salario + ", titulos=" + titulos + '}';
	} 
}