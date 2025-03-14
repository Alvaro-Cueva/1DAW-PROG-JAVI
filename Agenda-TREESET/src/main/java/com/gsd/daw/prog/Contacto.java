package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.List;

public class Contacto implements Comparable{
	
	private String nombre;
	private List<String>tlfs;
	
	public Contacto(String nombre) {
		this.nombre=nombre;
		tlfs=new ArrayList<>();
	}
	
	
	public void addTlf(String tlf) {
		if(!tlfs.contains(tlf))
			tlfs.add(tlf);
	}
	
	
	public void delTlf(String tlf) {
		if(!tlfs.contains(tlf))
			tlfs.remove(tlf);
	}


	public String getNombre() {
		return nombre;
	}


	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", tlfs=" + tlfs + "]";
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Contacto aux=(Contacto)o;
		
		return this.nombre.compareTo(aux.getNombre());
	}
	
	
	
	
	
	
	
}
