package com.gsd.daw.prog;

import java.util.Arrays;

import com.gsd.daw.prog.api.UnApi;

/**
 * Hola Mundo!
 */
public class App {

	public static void main(String[] args) {
		Agenda a1= new Agenda();
		String [] cto;
		for(int i = 0;i<args.length;i++) {
			cto=args[1].split(":");
			a1.addContacto(cto[0],cto[1]);
		}
		a1.imprimirAgenda();
		
		a1.buscarContacto("maria");
		
		a1.eliminarContactoCompleto("maria");
		a1.imprimirAgenda();
		a1.eliminarNumContactos("ana", "1111111");
		a1.imprimirAgenda();
	}
	
}
