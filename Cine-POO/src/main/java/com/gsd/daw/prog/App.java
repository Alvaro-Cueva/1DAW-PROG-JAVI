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
		
		Película p1 = new Película("It",160,18,"Stephen King");
		Cine c1 = new Cine("La Vaguada",p1,8.95,10,15);
		c1.mostrarPatio();
	}
}
