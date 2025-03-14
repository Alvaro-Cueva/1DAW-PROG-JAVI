package com.gsd.daw.prog;

import java.util.Arrays;

import com.gsd.daw.prog.api.UnApi;

/**
 * Hola Mundo!
 */
public class App {

	public static void main(String[] args) {
		Agenda a1= new Agenda();
		Contacto c1 = new Contacto("Pepe");
		Contacto c2 = new Contacto("Luis");
		Contacto c3 = new Contacto("Pepa");
		Contacto c4 = new Contacto("Luisa");
			
		a1.addCont(c4);
		a1.addCont(c3);
		a1.addCont(c2);
		a1.addCont(c1);
		a1.addTlfCt("1234", c4);
		
		System.out.println(a1);
		
//		for(int i = 0;i<args.length;i++) {
//			cto=args[1].split(":");
//			a1.addContacto(cto[0],cto[1]);
//		}
		
		
		
		
	}
	
}
