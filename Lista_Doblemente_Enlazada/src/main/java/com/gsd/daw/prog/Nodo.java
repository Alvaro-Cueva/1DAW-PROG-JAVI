package com.gsd.daw.prog;

public class Nodo implements Comparable<Nodo>{
	
	private String Dato;
	private Nodo next;
	private Nodo prev;
	
	public Nodo(String dato) {
		Dato = dato;
		next = null;
		prev=null;
	}
	
	
	
	public Nodo getPrev() {
		return prev;
	}



	public void setPrev(Nodo prev) {
		this.prev = prev;
	}



	public String getDato() {
		return Dato;
	}
	
	public void setDato(String dato) {
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

    @Override
    public int compareTo(Nodo o) {
        return this.Dato.compareToIgnoreCase(o.getDato());
    }
	
	
	
	
	
}
