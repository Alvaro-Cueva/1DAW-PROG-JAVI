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
		Password p1= new Password(15);
//		System.out.println(p1.getPass());
		Password p2 = new Password(20);
		Password p3 = new Password(30);
		Password p4 = new Password(10);
		Password p5 = new Password();
//		System.out.println(p2.getPass());
//		System.out.println(p3.getPass());
//		System.out.println(p4.getPass());
//		System.out.println(p5.getPass());
//		
		Password [] pass = new Password[5];
		for(int i=0;i <pass.length;i++) {
			pass[i] = new Password(i*8+20);
		}
		
		
		
		
//		pass[0]=p5;
//		pass[1]=p1;
//		pass[2]=p2;
//		pass[3]=p3;
//		pass[4]=p4;
		
		for(int i=0;i <pass.length;i++) {
			if(pass[i].isStrong())
				System.out.println(pass[i].getPass() +" es fuerte");
			else
				System.out.println(pass[i].getPass() +" NO es fuerte");
		}
	}
}
