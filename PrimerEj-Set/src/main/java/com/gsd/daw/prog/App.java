package com.gsd.daw.prog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		Set <String> nombres = new HashSet<>();
		
		nombres.add("Pepe");
		nombres.add("luis");
		nombres.add("Ana");
		nombres.add("null");
		nombres.add("luis");
		
		System.out.println(nombres.toString());
		
		nombres.remove("Pepe");
		
		System.out.println(nombres.toString());
		
		Iterator <String> it = nombres.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
