package com.gsd.daw.prog;

import java.util.HashMap;
import java.util.Map;

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
		Map <Integer, String> agenda = new HashMap<>();
		
		agenda.put(1234, "Pepe");
		agenda.put(2345, "Luis");
		agenda.put(1212, "Luis");
		
		System.out.println(agenda.get(1234));
		System.out.println(agenda.values());
		agenda.clear();
		System.out.println(agenda.values());
		agenda.keySet();
		System.out.println(agenda.values());
	}
}
