package com.gsd.daw.prog;

public class Mago extends Personaje{

	public Mago(String nombre,  int ataque, int defensa, int pociones, int nivel) {
		super(nombre, ataque, defensa, pociones, nivel);
		salud=80;
		ataque=(this.getAtaque()+(10*this.multiplicadorNivel(nivel)));
	}

	@Override
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		
	}
	
	public void lanzarHechizo(Personaje enemigo) {
		int aux=enemigo.getDefensa();
		enemigo.setDefensa(0);
		this.atacar(enemigo);
		enemigo.setDefensa(aux);
	}
	
	public void autoCurarse() {
		if (pociones >0) {
			salud=this.getSalud()+((this.getSalud()*3)/10);
			this.setPociones(pociones-1);
			//*3/10
		} else if(Math.random()*10<7) {
			System.out.println("Vaya, la cura ha fallado.");
		}else {
			salud=this.getSalud()+((this.getSalud()*3)/10);
		}
	}

}
