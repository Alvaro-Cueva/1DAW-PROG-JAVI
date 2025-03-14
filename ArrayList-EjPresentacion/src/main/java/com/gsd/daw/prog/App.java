package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.Scanner;

import com.gsd.daw.prog.api.UnApi;

/**
 * Hola Mundo!
 */
public class App {

	public static void main(String[] args) {
		
		int cpu=6;
		ArrayList <Procesos> l = new ArrayList<>();
		
		Procesos p1 = new Procesos(1234,12);
		Procesos p2 = new Procesos(1233,10);
		Procesos p3 = new Procesos(1232,7);
		Procesos p4 = new Procesos(1212,40);
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		
		
		System.out.println(l.toString());
		
		
		for(int i =0;i<l.size();i++) {
			System.out.println(l.get(i));
			//l[i]
		}
		
	}
}
