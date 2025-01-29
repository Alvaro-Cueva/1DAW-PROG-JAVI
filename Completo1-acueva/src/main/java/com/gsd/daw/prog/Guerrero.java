package com.gsd.daw.prog;

public class Guerrero extends Personaje{

	public Guerrero(String nombre, int ataque, int defensa, int pociones, int nivel) {
		super(nombre,ataque, defensa, pociones, nivel);
		
		this.setSalud(120*super.multiplicadorNivel(nivel)/10);
		defensa=this.getDefensa()+5;
	}

	@Override
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		
	}

	public void golpeCritico(Personaje enemigo) {
		if(Math.random()*10+1<5) {
			System.out.println(this.getNombre()+"usa golpe critico.....!Falla!");
		}else {
			System.out.println(this.getNombre()+"usa golpe critico.....!Acierta!");
			this.setAtaque(getAtaque()*2);
			this.atacar(enemigo);
			this.setAtaque(getAtaque()/2);
		}
	}
	
	
	

}
