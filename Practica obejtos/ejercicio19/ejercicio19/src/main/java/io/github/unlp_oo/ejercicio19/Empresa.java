package io.github.unlp_oo.ejercicio19;

import io.github.unlp_oo.ejercicio14.DateLapse;

public class Empresa extends Cliente {
	private String cuit;
	
	public Empresa(String n, String dir, String c) {
		super(n,dir);
		this.cuit = c;
	}

	@Override
	public double calcularMonto(DateLapse fecha) {
		return this.envios.stream().filter(envio -> fecha.includesDate(envio.getFecha()))
				.mapToDouble(envio -> envio.calcularMonto()).sum();
	}
	
}
