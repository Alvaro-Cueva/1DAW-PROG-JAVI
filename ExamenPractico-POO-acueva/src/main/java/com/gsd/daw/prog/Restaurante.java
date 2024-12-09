package com.gsd.daw.prog;

import java.util.Arrays;
import java.util.Scanner;

public class Restaurante {
	private String nombre;
	private int cant_mesas;
	private double caja;
	private Mesa [] mesas;
	private String [] menu;
	private double [] precio;
	
	public Restaurante(String nombre, int cant_mesas, double caja, String[] menu, double [] precio) {
		this.nombre = nombre;
		this.cant_mesas = cant_mesas;
		mesas = new Mesa[cant_mesas];
		for(int i=0;i<cant_mesas;i++) {
			mesas[i]= new Mesa(i+1,4);
		}
		this.caja = caja;
		this.menu = menu;
		this.precio = precio;
	}

	public String[] getMenu() {
		return menu;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCant_mesas() {
		return cant_mesas;
	}

	public double getCaja() {
		return caja;
	}

	public Mesa[] getMesas() {
		return mesas;
	}
	
	public void registrarPedidoEnMesa(int mesa) {
		System.out.println("Dime que plato quieres del menú del dia");
		Scanner t = new Scanner(System.in);
		String plato = t.nextLine();
		Arrays.sort(menu);
		int pos = Arrays.binarySearch(menu, plato);
		if(pos== -1) {
			System.err.println("Ese plato no esta");
			return;
		}
		System.out.println("Cuanto quieres");
		int cant = t.nextInt();
		Pedido aux= new Pedido (plato,precio[pos],cant,mesa);
		
		mesas[mesa-1].addPedido(aux);
	}
	
	public void listarPedidosMesa(int mesa) {
		double total = 0.0;
		Mesa aux= mesas[mesa];
		System.out.println(aux.totalMesa());
		aux.mostrarPlatos();
	}
	
	
	public void mostrarTotalMesas() {
		double dev =0.0;
		for(int i = 0;i<mesas.length;i++) {
			dev+=mesas[i].totalMesa();
		}
		System.out.println("El total de las mesas es: "+dev);
	}
	
	
	public void eliminarPedidoMesa(int mesa, String cod_ped) {
		mesas[mesa].delPedido(cod_ped);
	}
	
	
	
	

	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + ", cant_mesas=" + cant_mesas + ", caja=" + caja + ", mesas="
				+ Arrays.toString(mesas) + ", menu=" + Arrays.toString(menu) + "]";
	}
	
	
	
}
