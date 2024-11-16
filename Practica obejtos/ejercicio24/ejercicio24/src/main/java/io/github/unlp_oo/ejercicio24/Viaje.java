package io.github.unlp_oo.ejercicio24;

import java.time.LocalDate;
import java.util.List;

public class Viaje {
	private String origen;
	private String destino;
	private double total;
	private Vehiculo vehiculo;
	private LocalDate fecha;
	private List<Usuario> pasajeros;
	
	public Viaje(String origen, String destino, double total, Vehiculo vehiculo, LocalDate fecha) {
		this.origen = origen;
		this.destino = destino;
		this.total = total;
		this.vehiculo = vehiculo;
		this.fecha = fecha;
		this.pasajeros.add(this.vehiculo.getDueño());
	}
	
	
	private boolean puedoAgregar() {
		if(this.pasajeros.size() < this.vehiculo.getCapacidad()) {
			return true;
		}
		return false;
	}
	
	public void registrarPasajero(Pasajero p) {
		if (this.puedoAgregar() && p.puedoViajar()) {
			this.pasajeros.add(p);
			p.agregarViaje(this);
		}
	}
	
	public void procesarViaje() {
		double monto = total / this.pasajeros.size();
		this.pasajeros.stream().forEach(pasajero -> pasajero.quitarMonto(monto));
		
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


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
