package com.gsd.daw.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Agenda {
	Set <String> nombres;
	List <String> orden;
	Map <String, List<String>> contactos;
	public Agenda() {
		nombres = new TreeSet <>();
		orden = new ArrayList<>();
		contactos = new HashMap<>();
	}
	
	
	public boolean addContacto(String nombre, String tlf) {
		if (!verificarDatos(tlf)==true) 
			return false;
		if(!nombre.contains(nombre)) {
			nombres.add(nombre);
			contactos.put(nombre, new ArrayList<>());
		}
		orden.add(tlf);
		//Collections.sort(orden); 
		//Collections.sort(nombres); Esto sirve para ordenar listas , el TreeSet se ordena solo.
		contactos.get(nombre).add(tlf);
		return true;
	}
	
	
	private boolean verificarDatos(String t) {
		if(t.length()!=7) 
			return false;
		try {
			Integer.parseInt(t);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	
	public void imprimirAgenda() {
		for (String c : nombres ) { //bucle for each para recorrer orden e imprimir los datos del contacto.
			if(c==null) return;
			System.out.println(c +" "+ contactos.get(c).toString());
			System.out.println("------------------------------------");
		}
	}
	
	
	public void buscarContacto(String s) {
		if(nombres.contains(s))
			System.out.println(contactos.get(s).toString());
		else
			System.out.println("No existe este contacto");
	}
	
	
	public void eliminarContactoCompleto(String t) {
		if(nombres.contains(t)) {
			//eliminamos el set
			nombres.remove(t);
			//eliminamso del orden pasandole la lista de numeros
			orden.removeAll(contactos.get(t));
			//eliminamos del mapa
			contactos.remove(t);
		}
		else
			System.out.println("No existe este contacto");
	}
	
	
	public void eliminarNumContactos(String c, String n) {
		if(!orden.contains(n)) 
			return;
		if(!nombres.contains(c))
			return;
		if(contactos.get(c).contains(n)) {
			contactos.get(c).remove(c);
			if(contactos.get(c).isEmpty()) {
				eliminarContactoCompleto(c);
			}
		}
	}
	
	
}
