package com.gsd.daw.prog;

import com.gsd.daw.prog.api.UnApi;

/**
 * Hola Mundo!
 */
public class App {
	/**
	 * Punto de entrada de la aplicación
	 *
	 * @param args
	 *            no se espera ningún parámetro.
	 */
	public static void main(String[] args) {
		Libro a1 = new Libro("Los tres cerditos", "Juan",false);
		
		a1.mostrarInformacion();
		//a1.devolver();
		//a1.mostrarInformacion();
		//a1.prestar();
		//a1.mostrarInformacion();
		
		Usuario u1 = new Usuario ("Pepe","AS1721");
		
		u1.tomarPrestado(a1);
		
		a1.mostrarInformacion();
		
		System.out.println(u1.toString());
		
		
	}
}
