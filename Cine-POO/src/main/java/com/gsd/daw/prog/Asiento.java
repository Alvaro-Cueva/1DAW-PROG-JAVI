package com.gsd.daw.prog;

public class Asiento {
	
	private String columna;
	private String fila;
	private Espectador e;
	
	public Asiento(String columna, String fila) {
		this.columna = columna;
		this.fila = fila;
		this.e=null;
	}
	
	
	public String getColumna() {
		return columna;
	}





	public void setColumna(String columna) {
		this.columna = columna;
	}





	public String getFila() {
		return fila;
	}





	public void setFila(String fila) {
		this.fila = fila;
	}





	public Espectador getE() {
		return e;
	}





	public void setE(Espectador e) {
		this.e = e;
	}



	@Override
	public String toString() {
		return "Asiento [columna=" + columna + ", fila=" + fila + ", e=" + e + "]";
	}


	
	public void sentarEspectador(Espectador e) {
		this.e=e;
	}
	
	
	public boolean estaLibre() {
		if(e==null)
			return true;
		return false;
					
	}
	
	
//	public Asiento() {
//		this.columna = columna;
//		this.fila = fila;
//	}
//
//
//	private String [][] generarAsiento(){
//		
//		String [][] asiento=new String [9][8];
//		this.fila=0;
//		this.columna="";
//		int fila=0;
//		String letra= "A,B,C,D,E,F,G,J,H,I";
//		fila = (int )Math.random()*10;
//		for(int i=0;i<asiento.length;i++) {
//			for (int j =0; j<asiento[i].length;j++) {
//				
//			}
//		}
//		asiento=asiento[fila][letra[fila]];
//		return asiento;
//	}
	
	
}
