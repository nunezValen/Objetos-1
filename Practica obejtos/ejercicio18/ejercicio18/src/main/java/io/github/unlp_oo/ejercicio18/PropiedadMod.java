package io.github.unlp_oo.ejercicio18;

import java.time.LocalDate;

import io.github.unlp_oo.ejercicio14.DateLapse;

public class PropiedadMod extends Propiedad {

	public PropiedadMod(String n, double precio) {
		super(n, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cancelarReserva(Reserva r) {
		
		LocalDate hoy = LocalDate.now();
		DateLapse hoy2 = new DateLapse(hoy,hoy);
		
		
		if (!r.isOcupado(hoy2) && r.calcularDiasFaltantes(hoy) >= 7 )  {
			this.reservas.remove(r);
			return r.calcularPrecio();
		}else if (r.calcularDiasFaltantes(hoy) >= 2) {
			this.reservas.remove(r);
			return r.calcularPrecio();
		}
		return 0;
	}

}
