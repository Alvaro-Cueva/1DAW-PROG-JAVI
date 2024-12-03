package com.gsd.daw.prog;

public class Película {
	
	private String título;
	private int duración;
	private int minEdad;
	private String director;
	public Película(String título, int duración, int minEdad, String director) {
		this.título = título;
		this.duración = duración;
		this.minEdad = minEdad;
		this.director = director;
	}
	public String getTítulo() {
		return título;
	}
	public void setTítulo(String título) {
		this.título = título;
	}
	public int getDuración() {
		return duración;
	}
	public void setDuración(int duración) {
		this.duración = duración;
	}
	public int getMinEdad() {
		return minEdad;
	}
	public void setMinEdad(int minEdad) {
		this.minEdad = minEdad;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Película [título=" + título + ", duración=" + duración + ", minEdad=" + minEdad + ", director="
				+ director + "]";
	}

	
	
	
}
