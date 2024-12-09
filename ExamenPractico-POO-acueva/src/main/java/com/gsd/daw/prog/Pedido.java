package com.gsd.daw.prog;

public class Pedido {
	private static int contador = 0;
	private String cod_ped;
	private String plato;
	private double precio;
	private int cant;
	public Pedido(String plato, double precio, int cant,int mesa) {
		this.cod_ped = generarCodigo(plato,mesa);
		this.plato = plato;
		this.precio = precio;
		this.cant = cant;
	}
	
	private String generarCodigo(String plato, int mesa) {
		this.contador++;
		return "" +mesa+contador+plato.charAt(0)+plato.charAt(1);
	}

	public String getCod_ped() {
		return cod_ped;
	}

	public void setCod_ped(String cod_ped) {
		this.cod_ped = cod_ped;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public String getPlato() {
		return plato;
	}

	public double getPrecio() {
		return precio;
	}
	
	
}
