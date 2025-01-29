package com.gsd.daw.prog;

public interface Compatible {
	void atacar(Personaje enemigo);
	void defender(int daño);
	boolean estaVivo();
	void autoCurar();
}
