package io.github.unlp_oo.ejercicio18;

import java.time.LocalDate;

import io.github.unlp_oo.ejercicio14.DateLapse;

public class PropiedadFlex extends Propiedad {

	public PropiedadFlex(String n, double precio) {
		super(n, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cancelarReserva(Reserva r){
		LocalDate hoy = LocalDate.now();
		DateLapse hoy2 = new DateLapse(hoy,hoy);
		if (!r.isOcupado(hoy2)) {
			this.reservas.remove(r);
			return r.calcularPrecio();
		}
		return 0.0;
	} 

}
