package com.gsd.daw.prog;

public class Procesos {
	private int PID;
	private int quantum;
	public Procesos(int pID, int quantum) {
		super();
		this.PID = pID;
		this.quantum=quantum;
	}
	@Override
	public String toString() {
		return "Procesos [PID=" + PID + ", quantum=" + quantum + "]";
	}
	public int getQuantum() {
		return quantum;
	}
	public void setQuantum(int quantum) {
		this.quantum = quantum;
	}
	public int getPID() {
		return PID;
	}
	
	
	
	
}
