package com.gsd.daw.prog;

public class Cine {
	
	private String nombre;
	private Película p;
	private double precio;
	private Asiento [][] patio;
	private int filas;
	private int columnas;

	public Cine(String nombre, Película p, double precio, int filas, int columnas) {
		super();
		this.nombre = nombre;
		this.p = p;
		this.precio = precio;
		this.filas = filas;
		this.columnas = columnas;
		patio=generarAsientos(filas,columnas);
	}
	
	private Asiento [][] generarAsientos(int f, int c){
		//columnas son las letras
		Asiento [][] devolver = new Asiento [f][c];
		for(int i=f;i>0;i--) {
			char letra='A';
			for(int j=0;j<c;j++) {
				devolver[i][j]=new Asiento (Character.toString(letra),Integer.toString(i));
				letra++;
			}
		}
		return devolver;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Película getP() {
		return p;
	}

	public void setP(Película p) {
		this.p = p;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	
	public int huecosLibres() {
		int devolver=0;
		for(int i=0;i<patio.length;i++) {
			for(int j =0;j<patio[i].length;j++) {
				if(patio[i][j]==null)
					devolver++;
			}
		}
		return devolver;
	}
	
	public boolean asignarAsientoEspectador(Espectador e) {
		if(e.getEdad()<p.getMinEdad()) return false;
		if(e.getDinero()<this.precio)return false;
		if(huecosLibres() !=0) return false;
		
		boolean sentado=false;
		int fila_aleatoria;
		int columna_aleatoria;
		do {
			fila_aleatoria=(int)((Math.random()*filas))+1;
			columna_aleatoria=(int) ((Math.random()*columnas))+1;
			if(patio[fila_aleatoria][columna_aleatoria]==null) {
				patio[fila_aleatoria][columna_aleatoria].sentarEspectador(e);
				e.setDinero(e.getDinero()-this.precio);
				sentado=true;
			}
		}while(!sentado);
		return true;
	}

	@Override
	public String toString() {
		return "Cine [nombre=" + nombre + ", p=" + p + ", precio=" + precio + ", filas=" + filas + ", columnas="
				+ columnas + "]";
	}
	
	
	public void mostrarPatio() {
		for(int i=0;i<patio.length;i++) {
			for(int j =0;j<patio[i].length;j++) {
				if(patio[i][j]==null)
					System.out.println(patio[i][j].getFila()+" "+patio[i][j].getColumna());
				else
					System.out.println(" * ");
			}
			System.out.println(" ");
		}
	}
	
}
