package com.gsd.daw.prog;

import java.util.*;

public class Lista {
	
	private Nodo centinela;
	
	//private List <Nodo> listaNodos = new ArrayList<>();
	
//	public void add(int n) {
//		List<Nodo> aux= new ArrayList<>(listaNodos.size());
//		System.arraycopy(listaNodos, 0, aux, 0, listaNodos.size());
//		
//	}
	
	public Lista() {
		this.centinela=new Nodo(0);
		//this.centinela.setNext(centinela);
	}
	
	public void add(int n) {
		//crear una auxiliar para guardar valor que queremos añadir
		//otra auxiliar para guardar el valor que pedimos
		Nodo aux = centinela;
		Nodo aux1=new Nodo(n);		
		if(centinela.getNext()==null) {
			//centinela=aux1;//asignamos el valor de nuevo nodo dado al centinela el cual no tiene valor.
			centinela.setNext(aux1); //asignamos el puntero al siguiente nodo?
			return;
		}
		Nodo aux2=aux;
		while(aux.getNext()!=null) {
			aux2=aux;
			aux=aux2.getNext();
		}
		aux2.getNext().setNext(aux1);
	}
	


	public void get(int n) {
		int posicion = 0;
		Nodo aux = centinela;
		Nodo aux2=aux;
		if(posicion==n) {
			System.out.println(aux.getDato());
		}
		while(aux.getNext()!=null) {
			aux2=aux;
			aux=aux2.getNext();
			posicion++;
			if(posicion==n) {
				System.out.println(aux.getDato());
			}
		}
	}
	
	
	public void remove(int n) {
		int posicion = 0;
		Nodo aux = centinela;
		Nodo aux2=aux;
		if(posicion==n) {
			System.err.println("No se puede eliminar el Nodo Centinela");
			return;
		}
		while(aux.getNext()!=null) {
			aux2=aux;
			aux=aux2.getNext();
			posicion++;
			if(posicion==n) {
				aux2.setNext(aux.getNext());
				System.out.println("Elemento eliminado");
			}
		}
	}

	
	public void size() {
		int tamaño =0;
		Nodo aux = centinela;
		Nodo aux2=aux;
		if(aux.getNext()==null) {
			System.out.println("La lista tiene tamaño 0");
			return;
		}
		while(aux.getNext()!=null) {
			aux2=aux;
			aux=aux2.getNext();
			tamaño++;
		}
		System.out.println("La lista tiene un tamaño de: "+tamaño);
	}
	
	public void print() {
		
	}
	
	public void sort() {
		
	}
	
	public void esVacia() {
		
	}
	
}
