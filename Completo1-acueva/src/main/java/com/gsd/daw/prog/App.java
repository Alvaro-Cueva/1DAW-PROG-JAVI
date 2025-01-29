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
		Guerrero g = new Guerrero("Pepe",30,20,3,1);
		System.out.println(g.getSalud());
		
		Mago m = new Mago("Juan",10,10,2,1);
		System.out.println(m.getSalud());
		m.autoCurarse();
		System.out.println(m.getSalud());
		System.out.println(m.getPociones());
		m.autoCurarse();
		System.out.println(m.getSalud());
		System.out.println(m.getPociones());
		m.autoCurarse();
		System.out.println(m.getSalud());
	}
}
