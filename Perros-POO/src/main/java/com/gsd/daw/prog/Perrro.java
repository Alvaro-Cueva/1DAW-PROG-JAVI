package com.gsd.daw.prog;

public class Perrro {
	private String nombre;
	private String raza;
	private int edad;
	private String color;
	
	public Perrro(String nombre, String raza, int edad, String color) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.color = color;
	}
	
	public Perrro() {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Perrro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", color=" + color + "]";
	}
	
	
	
}
//Tendrá los atributos
//-nombre
//-raza
//-edad
//-color
//
//Un constructor con todos los parámetros
//y un constructor por defecto.
//getters y setters
//
//Crea una clase Reala 
//tendrá un array de perros
//
//los métodos será aniadirPerro() que se añadirá
//	- si la raza del perro es Galgo o Cocker
//	- si la edad del perro es mayor de 1 y menor de 7
//
//Si no se añade se informará
//
//mostrarPerros() enseñará los datos de los perros
//
//sacarPerros() saca una cantidad de perros pasada por parámetro