package com.gsd.daw.prog;

public class Biblioteca {

	private String nombre;
	private Libro[] libros;
	private Usuario[] socios;
	
	
}

//Clase Biblioteca:
//    Atributos:
//        nombre (String)
//        libros (Array de libros)
//        socios (Array Usuarios)
//    Métodos:
//        
//    addLibro(Libro libro): Añade un libro a la biblioteca, bien porque sea nuevo o porque sea una devolución
//    prestarLibro(Libro libro, Usuario usuario): saca un libro del array de libros y se lo añade al array de libros prestados del socio
//    altaUsuario(String): añade un usurario al array de socios generando el numero de socio correlativo junto con las 2 primeras letras de su nombre
//    bajaUsuario(String numSocio): elimina un socio, pero antes de ello debe hay que asegurarse de guardar todos los libros que tuviera el socio
//    librosPrestados(): Muestra todos los libros prestados, así como el usuario que los tiene
//    librosDisponibles(): Muestra todos los libros disponibles en la biblioteca.
//    mostrarLibros(): Muestra la información todos los libros de la biblioteca.