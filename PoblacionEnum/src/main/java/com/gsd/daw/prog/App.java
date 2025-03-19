package com.gsd.daw.prog;

import java.util.Arrays;
import java.util.*;

import com.gsd.daw.prog.api.UnApi;

/**
 * Hola Mundo!
 */
public class App {

	public static void main(String[] args) {
		Pais p1 = new Pais("España",48350000,"Madrid",Continentes.EUROPA);
		Pais p2 = new Pais("Francia",1543465,"Paris",Continentes.EUROPA);
		
		Acciones d = new Acciones();
		//ArrayList <Pais> PAISES= new Acciones<>();
		d.añadirPais(p2);
		d.mostrarTodoLosPaises();
		d.añadirPais(p1);
		d.mostrarTodoLosPaises();
		d.mostrarPorcentaje(p1);
		d.buscarPais("España");
		
	}
	
}
