package io.github.unlp_oo.ejercicio19;

import java.time.LocalDate;

public class Local extends Envio {
	
	private double costoFijo;
	private double costoAdicional;
	private boolean entregaRapida;
	
	public Local(String origen, String destino, LocalDate f, double p, boolean b) {
		super( origen,  destino,  f , p);
		this.costoFijo = 1000;
		this.costoAdicional = 500;
		this.entregaRapida = b;
	}
	
	
	public double getAdicional() {
		if (this.entregaRapida) {
			return this.costoAdicional;
		}
		return 0;
	}
	
	public double calcularMonto() {
		return 1000 + this.getAdicional();
	}
	
	
	
}
