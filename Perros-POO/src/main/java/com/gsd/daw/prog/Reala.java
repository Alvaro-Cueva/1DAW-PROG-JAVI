package com.gsd.daw.prog;

import java.util.Arrays;

public class Reala {
	private Perrro [] reala;
	
	public Reala() {
		reala= new Perrro[0];
	}
	
	
	public void addPerro(Perrro a) {
		if("Cocker".equalsIgnoreCase(a.getRaza())||"Galgo".equalsIgnoreCase(a.getRaza())) {
			if(a.getEdad()>1 && a.getEdad()<7);{
				Perrro[] aux = new Perrro [reala.length+1];
				System.arraycopy(reala, 0, aux, 0, reala.length);
				aux[reala.length]=a;
				reala=aux;
			}
		}else
			System.out.println("Perrete no añadido");
	}

	public void mostrarPerros() {
		for(int i=0; i< reala.length;i++) {
			System.out.println(reala[i].toString());
		}
	}
	
	public Perrro[] eliminarPerros(int n) {
		//damos mensajes de error
		if(n>reala.length) {
		System.err.println("No puedo borrar tantos perros");
		return null;
		}
		
		Perrro [] devolver = new Perrro[n];
		for(int i=reala.length -1;i>=reala.length-n;i--) {
			devolver[i-n+1]=reala[i];
			reala[i]=null;
		}
		
		Perrro [] aux = new Perrro[reala.length-n];
		System.arraycopy(reala, 0, aux, 0, reala.length-n);
		reala = aux;
		return devolver;
	}


	@Override
	public String toString() {
		return "Reala [reala=" + Arrays.toString(reala) + "]";
	}
	
	
}
//los métodos será aniadirPerro() que se añadirá
//- si la raza del perro es Galgo o Cocker
//- si la edad del perro es mayor de 1 y menor de 7
//
//Si no se añade se informará
//
//mostrarPerros() enseñará los datos de los perros
//
//sacarPerros() saca una cantidad de perros pasada por parámetro