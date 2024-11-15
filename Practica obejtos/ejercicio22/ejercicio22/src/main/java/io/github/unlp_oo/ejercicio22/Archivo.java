package io.github.unlp_oo.ejercicio22;

public class Archivo {
	private String nombre;
	
	public Archivo() {
		this.nombre = "";
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int tamaño() {
		return this.nombre.length();
	}
}
