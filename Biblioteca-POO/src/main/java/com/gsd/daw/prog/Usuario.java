package com.gsd.daw.prog;

import java.util.Arrays;

public class Usuario {
	private String nombre;
	private String numSocio;
	private Libro[] librosPrestados;

	public Usuario(String nombre, String numSocio) {
		this.nombre = nombre;
		this.numSocio = numSocio;
		this.librosPrestados = new Libro[0];
	}

	
	public Libro[] getLibrosPrestados() {
		return librosPrestados;
	}


	public void setLibrosPrestados(Libro[] librosPrestados) {
		this.librosPrestados = librosPrestados;
	}


	public String getNombre() {
		return nombre;
	}


	public String getNumSocio() {
		return numSocio;
	}


	public void tomarPrestado(Libro libro) {
		if(libro.isPrestado()==false) {
			libro.setPrestado(true);
			Libro [] aux = new Libro [librosPrestados.length+1];
			System.arraycopy(librosPrestados, 0, aux, 0, librosPrestados.length);
			aux[librosPrestados.length]=libro;
			librosPrestados=aux;
		}else {
		System.err.println("El libro no está disponible");
		}
	}
	
	
	public void devolverLibro(Libro libro) {
		if(libro.isPrestado()==true) {
			librosPrestados[librosPrestados.length]=null;
		}
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", numSocio=" + numSocio + ", librosPrestados="
				+ Arrays.toString(librosPrestados) + "]";
	}
	
		
	
	
}
//Clase Usuario:
//    Atributos:
//        nombre (String)
//        NumSocio (String)
//        librosPrestados (Array Libro): Un array de objetos de tipo Libro.
//    Métodos:
//        tomarPrestado(Libro libro): Asigna un libro al usuario si el libro está disponible.
//        devolverLibro(Libro libro): Devuelve el libro que el usuario tenía prestado.