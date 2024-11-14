package io.github.unlp_oo.ejercicio19;

import io.github.unlp_oo.ejercicio14.DateLapse;

public class Persona extends Cliente {
	private String DNI;
	
	
	public Persona(String n, String d, String DNI) {
		super(n, d);
		this.DNI = DNI;
		
	}

	@Override
	public double calcularMonto(DateLapse fecha) {
		return this.envios.stream().filter(envio -> fecha.includesDate(envio.getFecha()))
				.mapToDouble(envio -> envio.calcularMonto()).sum() * 0.90;
	}
	
}
