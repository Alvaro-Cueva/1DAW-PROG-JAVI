package com.gsd.daw.prog;

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
		String [] menu = {"Pollo","Patatas","Macarrones","Ensalada"};
		double [] precio = {5.25,3.45,5.90,3.45};
			
		Restaurante r1 = new Restaurante ("Divexo",4,menu,precio);
		r1.registrarPedidoEnMesa(1);
		//r1.listarPedidosMesa(1);
		r1.registrarPedidoEnMesa(1);
		r1.registrarPedidoEnMesa(1);
		r1.eliminarPedidoMesa(1, "11Po");
		r1.listarPedidosMesa(1);
		r1.mostrarTotalMesas();
		r1.cobrarMesa(2);
		System.out.println(r1.getCaja());
		
	}
}
