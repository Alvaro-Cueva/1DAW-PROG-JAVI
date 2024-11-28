package com.gsd.daw.prog;

import java.util.Arrays;

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
		
		Perrro p1 = new Perrro ("Lola","Galgo",3,"verde");
		Perrro p2 = new Perrro ("Lolo","Galgo",3,"verde");
		Perrro p3 = new Perrro ("Lolo","Dalmata",3,"verde");
		Perrro p4 = new Perrro ("Lolo","Cocker",3,"verde");
	
		
		Reala r1 = new Reala();
		r1.addPerro(p1);
		r1.addPerro(p2);
		r1.addPerro(p3);
		r1.addPerro(p4);
		r1.mostrarPerros();
		
		Perrro [] calle = r1.eliminarPerros(2);
		System.out.println(Arrays.toString(calle));
		
	}
	
}
