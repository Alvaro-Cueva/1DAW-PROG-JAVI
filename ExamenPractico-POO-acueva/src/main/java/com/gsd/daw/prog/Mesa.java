package com.gsd.daw.prog;

import java.util.Arrays;

public class Mesa {
	private int num;
	private Pedido [] pedidos;
	private int comensales;
	
	public Mesa(int num, int comensales) {
		this.num = num;
		this.pedidos = new Pedido[0];
		this.comensales = comensales;
	}
	@Override
	public String toString() {
		return "Mesa [num=" + num + ", pedidos=" + Arrays.toString(pedidos) + ", comensales=" + comensales + "]";
	}
	public Pedido[] getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}
	public int getComensales() {
		return comensales;
	}
	public void setComensales(int comensales) {
		this.comensales = comensales;
	}
	public int getNum() {
		return num;
	}
	
	public void addPedido(Pedido p) {
		if(pedidos==null) {
			pedidos=new Pedido[1];
			pedidos[0]=p;
			return;
		}
		Pedido [] aux = new Pedido [pedidos.length+1];
		System.arraycopy(pedidos, 0, aux, 0, pedidos.length);
		aux[pedidos.length]=p;
		pedidos=aux;
		return;
	}
	
	public void mostrarPlatos() {
		for(int i=0;i<pedidos.length;i++) {
			System.out.println(pedidos[i].getPlato());
		}
	}
	
	public double totalMesa() {
		double dev=0.0;
		for (int i = 0; i<pedidos.length;i++) {
			dev += (pedidos[i].getPrecio()*pedidos[i].getCant());
		}
		return dev;
	}
	
	public void delPedido(String cod_ped){
		int pos = buscarPedido(cod_ped);
		if(pos == -1)return;
		Pedido [] aux= new Pedido[pedidos.length-1];
		System.arraycopy(pedidos, 0, aux, 0, pos);
		System.arraycopy(pedidos, pos+1, aux, pos, pedidos.length-1-pos);
		pedidos=aux;
	}
	
	
	private int buscarPedido(String cod_ped) {
		for(int i =0;i<pedidos.length;i++) {
			if(cod_ped.equalsIgnoreCase(pedidos[i].getCod_ped()))
				return -1;
		}
		return -1;
	}
	
	public void freeMesa() {
		pedidos=null;
		this.comensales=0;
	}
	
	
}
