package ar.edu.unlp.info.oo1.distribuidora;

import java.time.LocalDate;

public class Consumo {

	private LocalDate fecha;
	private double consumoDeEnergiaActiva;
	private double consumoDeEnergiaReactiva;

	public Consumo(LocalDate fecha, double consumoActiva, double consumoReactiva) {
		this.fecha = fecha;
		this.consumoDeEnergiaActiva = consumoActiva;
		this.consumoDeEnergiaReactiva = consumoReactiva;
	}

	public double factorDePotencia() {
		return this.consumoDeEnergiaActiva / 
			Math.sqrt(Math.pow(this.consumoDeEnergiaActiva, 2)
					+ Math.pow(this.consumoDeEnergiaReactiva, 2));
	}

	public double costoEnBase(CuadroTarifario cuadroTarifario) {
		return this.consumoDeEnergiaActiva * cuadroTarifario.getPreciokWh();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getConsumoDeEnergiaActiva() {
		return consumoDeEnergiaActiva;
	}

	public double getConsumoDeEnergiaReactiva() {
		return consumoDeEnergiaReactiva;
	}

}
