package com.gsd.daw.prog;

public abstract class Personaje implements Compatible{
	protected String nombre;
	protected int salud;
	protected int ataque;
	protected int defensa;
	protected int pociones;
	protected int nivel;
	
	
	public Personaje(String nombre, int ataque, int defensa, int pociones, int nivel) {
		super();
		if(ataque<0||defensa<0||pociones<0||pociones>=5||nivel<1||nivel>10) {
			//throw EstadisticaInvalidaException();
		}
		this.nombre = nombre;
		this.salud = 100;
		this.ataque = ataque;
		this.defensa = defensa;
		this.pociones = pociones;
		this.nivel = nivel;
	}

	public int multiplicadorNivel(int nivel) {
		int [] multiplicador = {11,13,15,17,2,22,24,26,29,32};
//		int saludMultiplicada=(multiplicador[nivel-1]/10)*120;
//		this.salud=saludMultiplicada;
//		return salud;
		return multiplicador[(nivel-1)];
	}
	
//	public double modificadorNivel(int nivel) {
//		double modificador=0;
//		if(nivel<0||nivel>10) {
//			System.out.println("Error");
//		}else {
//			switch(nivel) {
//			case 1:
//				 return modificador= 1.1;
//			case 2:
//				 return modificador=1.3;
//
//			case 3:
//				return modificador=1.5;
//
//			case 4:
//				return modificador=1.7;
//			case 5:
//				return modificador=2;
//
//			case 6:
//				return modificador=2.2;
//
//			case 7:
//				return modificador=2.4;
//
//			case 8:
//				return modificador=2.6;
//
//			case 9:
//				return modificador=2.9;
//
//			case 10:
//				return modificador=3.2;
//
//			}
//		}
//		return modificador;
//	}
//	
	
	private void isAtaqueValido(int ataque) {
		if(ataque<0) {
			System.out.println("El valor introdudcion en el ataque no es válido.");
		}
	};
	
	public void isDefensaValido(int defensa) {
		if(defensa<0) {
			System.out.println("El valor introdudcion en la defensa no es válido.");
		}
	};
	
	

	@Override
	public void atacar(Personaje enemigo) {
		int saludEnemigo = enemigo.getSalud()-this.getAtaque();
		enemigo.setSalud(saludEnemigo);
		if (enemigo.getSalud()<=0) {
			System.out.println("El enemigo ha sido derrotado");
		}
		
	}

	@Override
	public void defender(int daño) {
		if(daño-defensa<0) {
			this.salud=0;
			System.out.println("El personaje ha sido derrotado");
		}
	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void autoCurar() {
		// TODO Auto-generated method stub
		
	}

	abstract public void mostrarInfo();


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getSalud() {
		return salud;
	}


	public void setSalud(int salud) {
		this.salud = salud;
	}


	public int getAtaque() {
		return ataque;
	}


	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}


	public int getDefensa() {
		return defensa;
	}


	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}


	public int getPociones() {
		return pociones;
	}


	public void setPociones(int pociones) {
		this.pociones = pociones;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	
	
	
	
	
}
