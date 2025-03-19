package com.gsd.daw.prog;

import java.util.*;

public class Acciones implements Comparable{
	private List <Pais> Paises;
	
	
	
	public Acciones() {
		Paises = new ArrayList<>();
	}

	public void añadirPais(Pais p) {
		if(Paises.contains(p))return;
		Paises.add(p);
		System.out.println("Pais añadido correctamente");
	}
	
	public void mostrarPaisesPorContinente(String cont) {
		if(!Paises.contains(cont)) return;
		for(Pais d: Paises) {
			d.getNombre();
		}
	}
	
	public void mostrarTodoLosPaises() {
		for(Pais d: Paises) {
			//d.getNombre();
			System.out.println(d.getNombre());
		}
	}
	
	public void buscarPais(String p) {
		if(!Paises.contains(p)) return;
		for(Pais d: Paises) {
			if(d.getNombre()==p)
			System.out.println(d.toString());
		}
	}
	
	public void mostrarPoblacionContinente(String cont) {
		if(!Paises.contains(cont))return;
		for(Pais d: Paises) {
			d.getContinente().values();
		}
	}
	
	
	public void mostrarPorcentaje(Pais pais) {
		if(!Paises.contains(pais))return;
		double var1=pais.getPoblacion()/10;
		double porcentaje = pais.getContinente().getPoblacion();
		double porcentajeFinal = var1/ porcentaje;
		System.out.println("El porcentaje es :"+porcentajeFinal);
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
	
	
	
}
