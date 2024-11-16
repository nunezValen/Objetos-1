package io.github.unlp_oo.ejercicio24;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class Pasajero extends Usuario{
	
	private List<Viaje> viajesRealizados;
	
	public Pasajero(String n, double s) {
		super(n, s);
		this.viajesRealizados = new ArrayList<Viaje>();
		// TODO Auto-generated constructor stub
	}
	
	public void agregarViaje(Viaje v) {
		this.viajesRealizados.add(v);
	}
	
	private boolean viajoReciente() {
		LocalDate hoy = LocalDate.now();
		if(this.viajesRealizados
				.stream()
				.noneMatch(viaje -> 30 
						< (int)ChronoUnit.DAYS.between(hoy, viaje.getFecha())) ) {
			return true;
		}
		return false;
	}
	
	@Override
	public void cargarSaldo(double monto) {
		if (this.viajoReciente()) {
			super.cargarSaldo(monto);
		} else {
			super.cargarSaldo(monto * 0.90);
		}
		
	}

	@Override
	public void quitarMonto(double monto) {
		if (!this.viajesRealizados.isEmpty()) {
			super.quitarMonto(monto - 500); 
		}
		else {
			super.quitarMonto(monto);
		}
	}

}
