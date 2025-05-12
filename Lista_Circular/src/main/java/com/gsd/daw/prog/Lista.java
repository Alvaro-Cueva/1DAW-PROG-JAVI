package com.gsd.daw.prog;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Lista {
	
	private Nodo centinela;
	
	public Lista() {
		this.centinela=new Nodo("Centinela");
		this.centinela.setNext(centinela);
	}
	
	public void add(String s) {
		Nodo aux = centinela;
		Nodo aux1=new Nodo(s);
		aux1.setNext(centinela);
		if(centinela.getNext()==centinela) {
			centinela.setNext(aux1); 
			return;
		}
		Nodo aux2=aux;
		while(aux.getNext()!=centinela) {
			aux2=aux;
			aux=aux2.getNext();
		}
		aux2.getNext().setNext(aux1);
	}
	
	public void add(String s, int pos) {
		int posicion = 0;
		Nodo aux = centinela;
		Nodo aux1=new Nodo(s);
		aux1.setNext(centinela);
		if(centinela.getNext()==centinela) {
			centinela.setNext(aux1); 
			return;
		}
		Nodo aux2=aux;
		while(aux.getNext()!=centinela) {
			aux2=aux;
			aux=aux2.getNext();
			posicion++;
			if(posicion==pos) {
				aux2.setNext(aux1);
				aux1.setNext(aux);
				
			}
		}
	}
	
	void sort() {
		boolean listo = false;
		do {
		int pos=0;
		Nodo aux = centinela;
		Nodo aux2=centinela;
		Nodo aux3=centinela;
		listo=true;
		while(aux.getNext()!=centinela) {
			aux3=aux2;
			aux2=aux;
			aux=aux2.getNext();
			pos++;
			if(aux2.getDato().length()>aux.getDato().length()&&pos>1) {
				aux3.setNext(aux);
				aux2.setNext(aux.getNext());
				aux.setNext(aux2);
				listo=false;
			}
		}
		}while(listo!=true);
	}
	
	
	public void get(int n) {
		int posicion=0;
		Nodo aux = centinela;
		Nodo aux2=aux;
		while(aux.getNext()!=centinela) {
			aux2=aux;
			aux=aux2.getNext();
			posicion++;
			if(posicion==n) {
				System.out.println(aux.getDato());
			}
		}
	}
	
	
	public void remove(int n) {
		int posicion=0;
		Nodo aux = centinela;
		Nodo aux2=aux;
		while(aux.getNext()!=centinela) {
			aux2=aux;
			aux=aux2.getNext();
			posicion++;
			if(posicion==n) {
				aux2.setNext(aux.getNext());
			}
		}
	}
	
	
	public void search(String s) {
		int posicion=0;
		Nodo aux = centinela;
		Nodo aux2=aux;
		if(centinela.getNext()==centinela) {
			System.out.println("El elemento que buscas no se encuentra en la lista circular");
		}
		while(aux.getNext()!=centinela) {
			aux2=aux;
			aux=aux2.getNext();
			posicion++;
			if(aux.getDato()==s) {
				System.out.println("El elemento "+s+" se encuentra en la posición "+posicion);
			}
		}
	}
	
	
	public void size() {
		int tamaño =0;
		Nodo aux = centinela;
		Nodo aux2=aux;
		if(centinela.getNext()==centinela) {
			throw new IllegalArgumentException("No hay elementos en la lista");
		}
		while(aux.getNext()!=centinela) {
			aux2=aux;
			aux=aux2.getNext();
			tamaño++;
		}
		System.out.println("La lista tiene un tamaño de: "+tamaño);
	}
	
	public void print() {
		Nodo aux = centinela;
		if(aux.getNext()==centinela) {
			throw new IllegalArgumentException("No hay elementos en la lista");
		}
		while(aux.getNext()!=centinela) {
			aux=aux.getNext();
			System.out.print(aux.getDato()+" ");
		}
	}
	
	public boolean isEmpty() {
		if(centinela.getNext()==centinela) {
			System.out.println("La lista esta vacía");
			return true;
		}
		System.out.println("La lista no esta vacía");
		return false;
	}
}
