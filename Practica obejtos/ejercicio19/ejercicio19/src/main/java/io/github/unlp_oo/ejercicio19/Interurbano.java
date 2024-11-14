package io.github.unlp_oo.ejercicio19;

import java.time.LocalDate;

public class Interurbano extends Envio {
	private double distancia;
	private double precioPorGramo;
	
	public Interurbano(double distancia, String or, String des, LocalDate f, double p) {
		super(or,des,f, p);
		this.distancia = distancia;
		if (this.distancia < 100) {
			this.precioPorGramo = 20;
		} else if( 500 < this.distancia) {
			this.precioPorGramo = 25;
		} else {
			this.precioPorGramo = 30;
		}
	}
	
	
	@Override
	public double calcularMonto() {
		return this.peso * this.precioPorGramo;
	}

}
