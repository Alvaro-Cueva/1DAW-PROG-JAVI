package com.gsd.daw.prog;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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
	}
	
	public void add(int n) {
		Nodo aux = centinela;
		Nodo aux1 = centinela;
		Nodo nuevo=new Nodo(n);
		int cont = 0;
		if(centinela.getNext()==null) {
			centinela.setNext(nuevo);
			return;
		}
		while(aux1.getNext()!=null) {
			if(cont>0&&aux.getDato()>nuevo.getDato()) {
				aux1.setNext(nuevo);
				nuevo.setNext(aux);
				return;
			} else if(aux.getNext()==null) {
				aux.setNext(nuevo);
				return;
			}
			aux1=aux;
			aux=aux.getNext();
			cont++;
		}
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
		Nodo aux = centinela;
		while(aux.getNext()!=null) {
			aux=aux.getNext();
			System.out.print(aux.getDato()+" ");
		}
	}
	
//	public void sort() {
//		boolean cambio = true;
//		if(centinela.getNext()==null) {
//			System.out.println("La lista no se puede ordenar porque esta vacia");
//			return;
//		}
//		do {
//		Nodo aux = centinela;
//		Nodo aux2=centinela;
//		Nodo aux3 = centinela;
//		int contador=0;
//		cambio = true;
//		while(aux2.getNext()!=null) {
//			if(contador>1 && aux2.getDato()>aux3.getDato()) {
//				aux.setNext(aux3);
//				aux2.setNext(aux3.getNext());
//				aux3.setNext(aux2);
//				cambio=false;
//			}
//			contador++;
//			aux=aux2;
//			aux2=aux3;
//			aux3=aux3.getNext();
//		}
//		}while(cambio!=true);
//	}
	public boolean isEmpty() {
		if(centinela.getNext()==null) {
			System.out.println("La lista esta vacía");
			return true;
			
		}
		System.out.println("La lista no esta vacía");
		return false;
		
	}
	
}
