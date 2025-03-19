package com.gsd.daw.prog;

public class Pais {
	private String nombre;
	private int poblacion;
	private String capital;
	private Continentes continente;
	public Pais(String nombre, int poblacion, String capital, Continentes continente) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.capital = capital;
		this.continente = continente;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public Continentes getContinente() {
		return continente;
	}
	public void setContinente(Continentes continente) {
		this.continente = continente;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCapital() {
		return capital;
	}
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", poblacion=" + poblacion + ", capital=" + capital + ", continente="
				+ continente + "]";
	}
	
	
}
