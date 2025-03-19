package com.gsd.daw.prog;

public enum Continentes {
	AFRICA(1373000,"Africa"),AMERICA(340000,"America"),ASIA(4598000,"Asia"),EUROPA(742300,"Europa"),OCEANIA(41000,"Oceania"),ANTARTIDA(5,"Antartida");
	//dividimos entre 1000
	private int poblacion;
	private String nombres;
	private Continentes(int poblacion, String nombres) {
		this.poblacion = poblacion;
		this.nombres = nombres;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public String getNombres() {
		return nombres;
	}
	
	
	
}
