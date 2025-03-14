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
		Empleado e1=new Empleado("Juan","390493404L",1600,"SDA");
		Map <String, Empleado> listaEmpleados = new HashMap<>();
		int opc = -1;
		int operacion;
		int cant;
		do {
		Scanner t = new Scanner (System.in);
		System.out.println("---Elige una opción---");
		System.out.println("1.-Añadir empleado");
		System.out.println("2.-Salario promedio");
		System.out.println("3.-Añadir titulacion");
		System.out.println("4.-Aumentar salario");
		System.out.println("5.-Mostrar la lista de los empleados");
		System.out.println("6.-Salir");
		
		opc = t.nextInt();
		t.nextLine();
		switch(opc) {
		case 1:
			System.out.println("Que empleado añades");
			String a1= t.nextLine();
			String [] partesEmpleado=a1.split("-");
			String nombre = partesEmpleado[0];
			String dni = partesEmpleado[1];
			String salario1 = partesEmpleado[2];
			int salario2 = Integer.parseInt(salario1);
			String titulos = partesEmpleado[3];
			Empleado em1 = new Empleado(nombre,dni,salario2,titulos);
			//String empleado = t.nextLine();
			listaEmpleados.put(em1.getDni(),em1);
			break;
		case 2:
			System.out.println("El salario promedio es: "+listaEmpleados.values(Empleadosueldo));
			listaEmpleados = t.nextLine();
			if(!prod.containsKey(listaEmpleados)) {
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
			System.out.println(listaEmpleados.toString());
		case 6:
			System.out.println("Adios");
			break;
		default:
			System.out.println("La opcion no es correcta");
		}
		}while(opc !=6);
	}
}
