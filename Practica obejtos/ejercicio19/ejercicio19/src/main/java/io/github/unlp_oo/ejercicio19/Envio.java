package io.github.unlp_oo.ejercicio19;

import java.time.LocalDate;

public abstract class Envio {
	protected LocalDate fecha;
	protected String origen;
	protected String destino;
	protected double peso;
	
	
	public Envio(String origen, String destino, LocalDate f, double p) {
		this.destino = destino;
		this.origen = origen;
		this.fecha = f;
		this.peso = p;
	}
	
	
	
	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public String getOrigen() {
		return origen;
	}



	public void setOrigen(String origen) {
		this.origen = origen;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	public abstract double calcularMonto();
	
	
	
}
