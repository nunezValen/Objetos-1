package io.github.unlp_oo.ejercicio23;

public abstract class Persona {
	private String nombre;
	private String direccion;
	

	public Persona(String n,String d) {
		this.nombre = n;
		this.direccion = d;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
