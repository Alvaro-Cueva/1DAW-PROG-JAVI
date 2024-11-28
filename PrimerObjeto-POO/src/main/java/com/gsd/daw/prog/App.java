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
		Viajero v1= new Viajero();
		v1.setNombre("Pepe");
		Viajero v2 = new Viajero("12345678-p","Lolo","Blas","Lituano","Buena vista");
		
		
		System.out.println(v2.getInfo());
		System.out.println(v1.getContador());
	}
}
