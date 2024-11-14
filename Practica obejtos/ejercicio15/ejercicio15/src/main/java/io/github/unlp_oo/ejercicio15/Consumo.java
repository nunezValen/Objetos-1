package io.github.unlp_oo.ejercicio15;

public class Consumo {
	private double consumoEnergiaActiva; //kWh
	private double consumoEnergiaReactiva; // kVArh
	
	public Consumo () {
		this.consumoEnergiaActiva = 0;
		this.consumoEnergiaReactiva = 0;
	}
	
	public Consumo (double ca, double cr) {
		this.consumoEnergiaActiva = ca;
		this.consumoEnergiaReactiva = cr;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public void setConsumoEnergiaActiva(double consumoEnergiaActiva) {
		this.consumoEnergiaActiva = consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}

	public void setConsumoEnergiaReactiva(double consumoEnergiaReactiva) {
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	
	
}
