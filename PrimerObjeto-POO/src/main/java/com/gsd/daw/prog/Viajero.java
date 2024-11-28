package com.gsd.daw.prog;

public class Viajero {
	private static int contador=0;
	private String dni;
	private String nombre;
	private String apellidos;
	private String nacion;
	private String direcc;
	
	public Viajero(String dni, String nombre, String apellidos, String nacion, String direcc) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nacion=nacion;
		this.direcc=direcc;
		contador++;
	}
	
	public Viajero() {
		this.dni="";
		this.nombre="";
		this.apellidos="";
		this.nacion="";
		this.direcc="";
		contador++;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) { this.nombre=nombre;}
	
	public String getApellidos() {return apellidos;}
	public void setApellidos(String apellidos) { this.apellidos=apellidos;}
	
	public String getNacion() {return nacion;}
	public void setNacion(String nacion) { this.nacion=nacion;}
	
	public String getDirecc() {return direcc;}
	public void setDirecc(String direcc) { this.direcc=direcc;}
	
	public String getInfo() {
		return "Nombre: "+ nombre +"\nApellidos: "+apellidos+"\nDni: "+dni+"\nNacionalidad: "+nacion+"\nDirección: "+direcc;
	}
	
	public int getContador() {return contador;}
}
