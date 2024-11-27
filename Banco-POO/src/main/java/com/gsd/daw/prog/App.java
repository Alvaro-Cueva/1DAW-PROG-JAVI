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
		Cuenta a = new Cuenta("Javi");
		Cuenta b = new Cuenta();
		
		
		b.setCliente("Pepa");
		a.ingreso(1200);
		b.ingreso(500);
		System.out.println(a.reintegro(200));
		System.out.println(a.transferencia(b,1000));
		System.out.println(b.getSaldo());		
		
//		System.out.println(a);
//		a.ingreso(10);
//		System.out.println(a.getSaldo());
//		a.reintegro(100);
//		System.out.println(a.getSaldo());
//		a.transferencia(b, 120);
//		System.out.println(a.getSaldo());
//		System.out.println(b.getSaldo());

	}
}
