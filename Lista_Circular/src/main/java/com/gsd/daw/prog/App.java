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
		nuevaLista.add("holaaaaaaaaaaaaaaa");
		nuevaLista.add("hola1");
		nuevaLista.add("hola22");
		nuevaLista.add("hola333");
		nuevaLista.add("hola444");
		nuevaLista.add("hola55555");
		nuevaLista.add("hola6");
		nuevaLista.add("hola777", 5);
		nuevaLista.search("hola1");
		System.out.println("--------1--------");
		nuevaLista.print();
		System.out.println("--------2--------");
		nuevaLista.get(2);
		System.out.println("---------3-------");
		nuevaLista.remove(4);
		System.out.println("--------4--------");
		nuevaLista.size();
		System.out.println("---------5-------");
		nuevaLista.isEmpty();
		System.out.println("---------6-------");
		nuevaLista.print();
		System.out.println("---------7-------");
		nuevaLista.sort();
		System.out.println("---------8-------");
		nuevaLista.print();
	}
}
