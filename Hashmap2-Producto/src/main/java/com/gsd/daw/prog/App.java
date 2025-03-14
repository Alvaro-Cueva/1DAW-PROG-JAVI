package com.gsd.daw.prog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
		Map <String, Integer> prod = new HashMap<>();
		int opc = -1;
		String producto="";
		int operacion;
		int cant;
		
		Scanner t = new Scanner (System.in);
		System.out.println("---Elige una opción---");
		System.out.println("1.-Añadir producto");
		System.out.println("2.-Añadir stock");
		System.out.println("3.-Retirara stock");
		System.out.println("4.-Eliminar producto");
		System.out.println("5.-Imprimir productos");
		System.out.println("6.-Salir");
		
		opc = t.nextInt();
		t.nextLine();
		switch(opc) {
		case 1:
			System.out.println("Que producto añades");
			producto = t.nextLine();
			prod.put(producto,0);
			break;
		case 2:
			System.out.println("Que producto añades");
			producto = t.nextLine();
			if(!prod.containsKey(producto)) {
				System.err.println("El producto no está");
				break;
			}
			System.out.println("Que cantidad");
			cant = t.nextInt();
			operacion = cant +prod.get(producto);
			prod.put(producto,operacion);
			operacion=0;
			break;
		case 3:
			System.out.println("Que producto retiras");
			producto = t.nextLine();
			if(!prod.containsKey(producto)) {
				System.out.println("El producto no está");
				break;
			}
			System.out.println("Que cantidad");
			cant =t.nextInt();
			operacion = prod.get(producto)-cant;
			if(operacion<0) {
				System.err.println("No hay tantos, te llevas todos");
				operacion=0;
			}
			prod.put(producto,operacion);
			operacion=0;
			break;
		case 4:
			System.out.println("Que producto retiras");
			producto = t.nextLine();
			if(!prod.containsKey(producto)) {
				System.out.println("El producto no está");
				break;
			}
			prod.remove(producto);
		case 5:
			System.out.println(prod.toString());
		case 6:
			System.out.println("Adios");
			break;
		default:
			System.out.println("La opcion no es correcta");
		}
	}
}
