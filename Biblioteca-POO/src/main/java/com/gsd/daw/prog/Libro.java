package com.gsd.daw.prog;

public class Libro {
	private String título;
	private String autor;
	private boolean prestado;
	
	 public Libro(String título, String autor, boolean prestado) {
			this.título = título;
			this.autor = autor;
			this.prestado = prestado;
		}
	
	 public Libro() {
			this.título = título;
			this.autor = autor;
			this.prestado = prestado;
		}
	 
	 
	 public boolean prestar() {
		 if(this.prestado==true) {
			 System.err.println("El libro ya esta prestado");
			 return true;
		 }
		 return this.prestado=true;
	 }
	 
	 
	 public boolean devolver() {
		 if(this.prestado==true)
			 return this.prestado=false;
		 System.err.println("Error el libro no esta prestado");
		 return false;
	 }
	 
	 
	 public void mostrarInformacion() {
		 System.out.println("Título: "+this.título);
		 System.out.println("Autor: "+this.autor);
		 System.out.println("Estado: "+this.prestado);
		 
		 
	 }

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public String getTítulo() {
		return título;
	}

	public String getAutor() {
		return autor;
	}
	 
	 
	 
	 
	 
	 
	 
}
//prestar():
//Marca el libro como prestado si no lo está ya.
//devolver(): Marca el libro como disponible.
//mostrarInformacion(): Muestra el título, el autor y el estado del libro.