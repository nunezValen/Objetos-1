package io.github.unlp_oo.ejercicio17;
import java.time.LocalDate;
import java.util.*;

import io.github.unlp_oo.ejercicio14.DateLapse;

public class Propiedad {
	
	private String nombreDescriptivo;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	public Propiedad( String n, double precio) {
		this.nombreDescriptivo = n;
		this.precioPorNoche = precio;
		this.reservas = new ArrayList<Reserva>();
	}

	public String getNombreDescriptivo() {
		return nombreDescriptivo;
	}

	public void setNombreDescriptivo(String nombreDescriptivo) {
		this.nombreDescriptivo = nombreDescriptivo;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	private void agregarReserva(DateLapse p) {
		Reserva r = new Reserva(p,this);
		this.reservas.add(r);
	}
	
	public boolean isOcupada(DateLapse periodo) {
		return this.reservas.stream().noneMatch(reserva -> reserva.isOcupado(periodo));
	}
	
	public boolean realizarReserva(DateLapse periodo) {
		if (this.isOcupada(periodo)) {
			this.agregarReserva(periodo);
			return true;
		}
		return false;
	}
	
	public void cancelarReserva(Reserva r) {
		LocalDate hoy = LocalDate.now();
		DateLapse hoy2 = new DateLapse(hoy,hoy);
		if (!r.isOcupado(hoy2)) {
			this.reservas.remove(r);
		}
	}
	
	public double calcularIngresos(DateLapse periodo) {
		return this.reservas.stream().filter(reserva -> reserva.isOcupado(periodo))
				.mapToDouble(reserva -> reserva.calcularPrecio()).sum() * 0.75;
	}
	
	
}
