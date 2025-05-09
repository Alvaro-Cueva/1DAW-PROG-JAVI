package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gsd.daw.prog.api.UnApi;

/**
 * Hola Mundo!
 */
public class App {
	public static void main(String[] args) {
		Lista nuevaLista= new Lista();
		nuevaLista.add(3);
		nuevaLista.print();
		nuevaLista.add(2);
		nuevaLista.print();
		nuevaLista.add(12);
		nuevaLista.print();
		nuevaLista.add(4);
		nuevaLista.print();
		nuevaLista.add(1);
		nuevaLista.add(2);
		nuevaLista.size();
		nuevaLista.get(0);
		nuevaLista.get(1);
		nuevaLista.get(2);
//		nuevaLista.remove(0);
//		nuevaLista.size();
//		nuevaLista.get(1);
//		nuevaLista.get(2);
//		nuevaLista.get(0);
//		nuevaLista.esVacia();
		nuevaLista.print();
		System.out.println("----------------");
		//nuevaLista.add(2);
//		nuevaLista.sort();
		nuevaLista.print();
	}
}
