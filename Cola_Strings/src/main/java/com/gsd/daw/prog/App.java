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
		nuevaLista.enqueue("hola");
		nuevaLista.enqueue("hola1");
		nuevaLista.enqueue("hola2");
		nuevaLista.enqueue("hola3");
		nuevaLista.enqueue("hola4");
		nuevaLista.enqueue("hola5");
		nuevaLista.enqueue("hola6");
		nuevaLista.dequeue();
		nuevaLista.size();
		nuevaLista.isEmpty();
		nuevaLista.print();
		System.out.println("----------------");
		nuevaLista.dequeue();
		nuevaLista.print();
	}
}
