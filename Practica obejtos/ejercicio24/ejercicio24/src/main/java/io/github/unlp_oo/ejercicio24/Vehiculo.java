package io.github.unlp_oo.ejercicio24;

import java.time.LocalDate;

public class Vehiculo {
	private String descripcion;
	private int capacidad;
	private int fabricacion;
	private double valor;
	private Conductor Dueño;
	
	public Vehiculo(String descripcion, int capacidad, int fabricacion, double valor, Conductor d) {
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.fabricacion = fabricacion;
		this.valor = valor;
		this.Dueño = d;
	}
	
	public double getComision() {
		LocalDate hoy = LocalDate.now();
		
		if (this.fabricacion < hoy.getYear()) {
			return 0.99;
		}
		return 0.90;
	}
	
	
	
	
	public Conductor getDueño() {
		return Dueño;
	}

	public void setDueño(Conductor dueño) {
		Dueño = dueño;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getFabricacion() {
		return fabricacion;
	}
	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
