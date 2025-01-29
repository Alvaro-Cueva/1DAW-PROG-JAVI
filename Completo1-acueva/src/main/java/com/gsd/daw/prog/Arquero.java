package com.gsd.daw.prog;

public class Arquero extends Personaje{

	public Arquero(String nombre, int ataque, int defensa, int pociones, int nivel) {
		super(nombre, ataque, defensa, pociones, nivel);
		defensa=((this.getDefensa()+3)*this.multiplicadorNivel(nivel))/10;
		ataque=((this.getAtaque()+3)*this.multiplicadorNivel(nivel))/10;
	}

	@Override
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		
	}
	
	public void disparoAcertado(Personaje enemigo) {
		if(Math.random()*4<3) {
			System.out.println("Vaya, la cura ha fallado.");
		}else {
			int aux=this.getAtaque();
			this.setAtaque(aux*2);
			this.atacar(enemigo);
			this.setAtaque(aux);
		}
	}
	
	//3,8 -  
	
	
	
}
