package com.gsd.daw.prog;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Map<String, Empleado> listaEmpleados = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int opc;
		do {
			System.out.println("\n--- Menú de opciones ---");
			System.out.println("1.- Añadir empleado");
			System.out.println("2.- Mostrar salario promedio");
			System.out.println("3.- Añadir titulación");
			System.out.println("4.- Aumentar salario");
			System.out.println("5.- Mostrar lista de empleados");
			System.out.println("6.- Salir");
			System.out.print("Seleccione una opción: ");
			opc = scanner.nextInt();
			scanner.nextLine(); // Consumir nueva línea 
			switch (opc) {
			case 1:
				agregarEmpleado(listaEmpleados, scanner);
				break;
			case 2:
				calcularSalarioPromedio(listaEmpleados);
				break;
			case 3:
				agregarTitulo(listaEmpleados, scanner);
				break;
			case 4: aumentarSalario(listaEmpleados, scanner);
			break;
			case 5: mostrarEmpleados(listaEmpleados);
			break;
			case 6:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida, intente nuevamente.");
				}
			} while (opc != 6);
		scanner.close();
		}
		private static void agregarEmpleado(Map<String, Empleado> listaEmpleados, Scanner scanner) {
			System.out.print("Ingrese nombre del empleado: ");
			String nombre = scanner.nextLine();
			System.out.print("Ingrese DNI del empleado: ");
			String dni = scanner.nextLine();
			System.out.print("Ingrese salario del empleado: ");
			double salario = scanner.nextDouble();
			scanner.nextLine(); // Consumir nueva línea
			if (listaEmpleados.containsKey(dni)) {
				System.out.println("Ya existe un empleado con ese DNI.");
			} else { Empleado empleado = new Empleado(nombre, dni, salario);
			listaEmpleados.put(dni, empleado);
			System.out.println("Empleado agregado exitosamente.");
			} 
		} 
		private static void calcularSalarioPromedio(Map<String, Empleado> listaEmpleados) {
			if (listaEmpleados.isEmpty()) { System.out.println("No hay empleados registrados.");
			return;
			} 
			double suma = 0; 
			for (Empleado emp : listaEmpleados.values()) {
				suma += emp.getSalario();
				} 
			double promedio = suma / listaEmpleados.size();
			System.out.println("El salario promedio es: " + promedio);
			} 
		private static void agregarTitulo(Map<String, Empleado> listaEmpleados, Scanner scanner) {
			System.out.print("Ingrese el DNI del empleado: ");
			String dni = scanner.nextLine();
			Empleado empleado = listaEmpleados.get(dni);
			if (empleado != null) { System.out.print("Ingrese el título a añadir: ");
			String titulo = scanner.nextLine();
			empleado.agregarTitulo(titulo);
			System.out.println("Título añadido correctamente.");
			} else { System.out.println("No se encontró un empleado con ese DNI.");
			} 
			} 
		private static void aumentarSalario(Map<String, Empleado> listaEmpleados, Scanner scanner) {
			System.out.print("Ingrese el porcentaje de aumento (ej. 10 para 10%): ");
			double porcentaje = scanner.nextDouble();
			scanner.nextLine(); // Consumir nueva línea
			for (Empleado empleado : listaEmpleados.values()) {
				double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
				empleado.setSalario(nuevoSalario);
				} System.out.println("Salarios actualizados con un " + porcentaje + "% de aumento.");
			}
		private static void mostrarEmpleados(Map<String, Empleado> listaEmpleados) {
			if (listaEmpleados.isEmpty()) {
				System.out.println("No hay empleados registrados.");
				} else {
					for (Empleado empleado : listaEmpleados.values()) {
						System.out.println(empleado); }
					}
			}	
	}