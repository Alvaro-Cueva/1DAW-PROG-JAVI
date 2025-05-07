package com.gsd.daw.prog;

public class Nodo {
	
	private int Dato;
	private Nodo next;
	
	public Nodo(int dato) {
		Dato = dato;
		next = null;
	}
	
	public int getDato() {
		return Dato;
	}
	
	public void setDato(int dato) {
		Dato = dato;
	}
	
	public Nodo getNext() {
		return next;
	}
	
	public void setNext(Nodo next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Nodo [Dato=" + Dato + ", next=" + next + "]";
	}
	

	
	
	
}
