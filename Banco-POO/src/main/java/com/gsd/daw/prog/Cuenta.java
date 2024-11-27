package com.gsd.daw.prog;

public class Cuenta {
	
	private String cliente;
	private String cuenta;
	private double interés;
	private double saldo;
	
	public Cuenta(String cliente) {
		this.cliente = cliente;
		this.cuenta = aleatorio();
		this.interés = 1.5;
		this.saldo = saldo;
	}
	
	public Cuenta() {
		this.cliente = "";
		this.cuenta = aleatorio();
		this.interés = 1.5;
		this.saldo = saldo;
	}

	private String aleatorio() {
		String devolver="ES";
		devolver+=(int)(Math.random()*500000000);
		return devolver;
	}
	
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCuenta() {
		return cuenta;
	}

	public double getInterés() {
		return interés;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setInterés(double interés) {
		this.interés = interés;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [cliente=" + cliente + ", cuenta=" + cuenta + ", interés=" + interés + ", saldo=" + saldo + "]";
	}

	public boolean ingreso(double a) {
		if(a<=0) {
			System.out.println("El ingreso no puede ser 0 o menos");
			return false;
		}
		this.saldo=this.saldo+a;
		return true;
	}
	
	public boolean reintegro(double a) {
		if(a<=0||this.saldo-a<0) {
			System.out.println("El saldo de la cuenta no puede ser inferiror a 0");
			return false;
		}
		this.saldo-=a;
		return true;
	}
	
	public boolean transferencia(Cuenta b,double c) {
		
		if(reintegro(c)) {
			b.ingreso(c);
			return true;
		}
		
//		if(this.getSaldo()<c) {
//			System.out.println("No se puede realizar la transferencia ya que no hay fondos suficientes");
//			return;
//		}
//		b.ingreso(c);
//		this.saldo-=c;
		return false;
	}
	
}
