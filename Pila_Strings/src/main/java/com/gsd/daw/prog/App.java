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
		nuevaLista.push("hola");
		nuevaLista.push("hola1");
		nuevaLista.push("hola2");
		nuevaLista.push("hola3");
		nuevaLista.push("hola4");
		nuevaLista.push("hola5");
		nuevaLista.push("hola6");
		nuevaLista.peek();
		nuevaLista.print();
		System.out.println("----------------");
		nuevaLista.pop();
		nuevaLista.size();
		nuevaLista.isEmpty();
		nuevaLista.print();
		System.out.println("----------------");
		nuevaLista.peek();
	}
}
