package io.github.unlp_oo.ejercicio23;

public class Producto {
	private String nombre;
	private String categoria;
	private double precio;
	private int cantDisponibles;
	
	
	public Producto(String nombre, String categoria, double precio, int cantDisponibles) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.cantDisponibles = cantDisponibles;
	}
	
	public boolean venderProductos(int cant) {
		if(this.cantDisponibles >= cant) {
			this.cantDisponibles -= cant;
			return true;
		}
		return false;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
