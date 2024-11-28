package com.gsd.daw.prog;

public class Password {
	private static final int DEFAULT=8;
	private int lon;
	private String pass;
	
	public Password() {
		lon=DEFAULT;
		pass=generatePass();
	}
	
	public Password(int n) {
		lon=n;
		pass=generatePass();
	}
	
	
	public static int getDefault() {
		return DEFAULT;
	}
	 public int getLon() {
		 return lon;
	 }
	public String getPass() {
		return pass;
	}
	
	private String generatePass() {
		//del 33 al 126
		String devolver="";
		for(int i=0;i<lon;i++) {
			devolver+= (char)((Math.random()*93)+33);
		}
		return devolver;
	}
	
	
	public boolean isStrong() {
		//mas de 1 min mas de 2 mayus y mas de 5 num
		if(lon<11) return false;
		int min= contarMinus();
		if(min<2) return false;
		int mayus=contarMayus();
		if(mayus<3) return false;
		int num=contarNum();
		if(num<6) return false;
		return true;
	}
	
	private int contarMinus() {
		int num=0;
		for(int i =0;i<lon;i++) {
			if(Character.isLowerCase(pass.charAt(i)));
				num++;
				if(num>2) return 2;
		}
		return num;
	}
	
	private int contarMayus() {
		int num=0;
		for(int i =0;i<lon;i++) {
			if(Character.isLowerCase(pass.charAt(i)));
				num++;
				if(num>3) return 3;
		}
		return num;
	}
	
	
	private int contarNum() {
		int num=0;
		for(int i =0;i<lon;i++) {
			if(Character.isDigit(pass.charAt(i)));
				num++;
				if(num>5) return 5;
		}
		return num;
	}
	
}
	
	
//variable para las letras
//variable para los numeros
//variable para los símbolos
//generar numero random para usar tabla ascii

//Haz una clase llamada Password que siga las siguientes condiciones:
//
//Que tenga los atributos longitud y contraseña . 
//Por defecto, la longitud sera de 8.
//
//Los constructores serán los siguiente:
//    Un constructor por defecto.
//    Un constructor con la longitud que nosotros le pasemos. 
//    Generara una contraseña aleatoria con esa longitud.
//
//    Los métodos que implementa serán:
//        
//        esFuerte(): devuelve un booleano si es fuerte o no, 
//        para que sea fuerte debe tener mas de 2 mayúsculas, 
//        mas de 1 minúscula y mas de 5 números.
//        
//        generarPassword():  genera la contraseña del objeto con la longitud que tenga.
//        Método get para contraseña y longitud.
//        Método set para longitud.
//
//Ahora, crea una clase clase ejecutable:
//
//    Crea un array de Passwords con el tamaño que tu le indiques por teclado.
//    Crea un bucle que cree un objeto para cada posición del array.
//    Indica también por teclado la longitud de los Passwords (antes de bucle).
//    Crea otro array de booleanos donde se almacene si el password del array 
//    de Password es o no fuerte (usa el bucle anterior).
//    Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). 
//Usa este simple formato:
//
//contraseña1 valor_booleano1
//contraseña2 valor_bololeano2
