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

	List <Integer> l = new ArrayList <Integer>();
	Scanner t = new Scanner(System.in);
	int num;
	do{
		num=t.nextInt();
		if(num!=-99)
			l.add(num);
	}while(num!=-99);
	System.out.println("El numero de valores leidos es: "+l.size());
	int sum=0;
	for(int i=0;i<l.size();i++) {
		sum+=l.get(i);
	}
	int media=sum/l.size();
	System.out.println("La suma es "+sum);	
	System.out.println("La media es "+media);
	for(Integer numero : l) {
		System.out.println(numero);
		if(numero>media) {
			System.out.println(" es mayor de la media");
		}
	}
	l.remove(0);
	System.out.println(l.toString());	
	}
}
