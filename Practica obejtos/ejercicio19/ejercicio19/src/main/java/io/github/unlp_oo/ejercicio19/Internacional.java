package io.github.unlp_oo.ejercicio19;

import java.time.LocalDate;

public class Internacional extends Envio {
	private double precioPorGramo;
	private double precioDestino;
	
	
	public Internacional(String origen, String destino, LocalDate f, double p) {
		super(origen, destino, f, p);
		
		this.precioDestino = 5000;
		if (this.peso >= 1000 ) {
			this.precioPorGramo = 12;
		} else {
			this.precioPorGramo = 10;
		}
		
	}

	
	
	
	
	@Override
	public double calcularMonto() {
		return this.precioDestino + this.peso * this.precioPorGramo;
	}

}
