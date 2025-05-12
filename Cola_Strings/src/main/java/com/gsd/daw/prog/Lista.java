package com.gsd.daw.prog;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Lista {
	
	private Nodo centinela;
	
	public Lista() {
		this.centinela=new Nodo("Centinela");
	}
	
	public void enqueue(String s) {
		Nodo aux = centinela;
		Nodo aux1=new Nodo(s);		
		if(centinela.getNext()==null) {
			centinela.setNext(aux1); 
			return;
		}
		Nodo aux2=aux;
		while(aux.getNext()!=null) {
			aux2=aux;
			aux=aux2.getNext();
		}
		aux2.getNext().setNext(aux1);
	}
	


	public void dequeue() {
		if(centinela.getNext()==null) {
			throw new IllegalArgumentException("No hay elementos en la lista");
		}else {
		System.out.println(centinela.getNext().getDato());
		}
	}

	
	public void size() {
		int tamaño =0;
		Nodo aux = centinela;
		Nodo aux2=aux;
		if(centinela.getNext()==null) {
			throw new IllegalArgumentException("No hay elementos en la lista");
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
		if(aux.getNext()==null) {
			throw new IllegalArgumentException("No hay elementos en la lista");
		}
		while(aux.getNext()!=null) {
			aux=aux.getNext();
			System.out.print(aux.getDato()+" ");
		}
	}
	
	public boolean isEmpty() {
		if(centinela.getNext()==null) {
			System.out.println("La lista esta vacía");
			return true;
		}
		System.out.println("La lista no esta vacía");
		return false;
	}
}
