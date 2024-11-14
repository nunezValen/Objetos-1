package io.github.unlp_oo.ejercicio11;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class PlazoFijo implements Inversion {
	private java.time.LocalDate fecha;
	private double montoDepositado;
	private double interesDiario;
	
	public PlazoFijo() {
		this.montoDepositado = 0;
		this.interesDiario = 0;
		this.fecha = LocalDate.now();
	}
	
	public PlazoFijo(LocalDate fecha, double montoDepositado, double interesDiario) {
		super();
		this.fecha = LocalDate.now();
		this.montoDepositado = montoDepositado;
		this.interesDiario = interesDiario;
	}



	public java.time.LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}



	public double getMontoDepositado() {
		return montoDepositado;
	}



	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}



	public double getInteresDiario() {
		return interesDiario;
	}



	public void setInteresDiario(double interesDiario) {
		this.interesDiario = interesDiario;
	}



	@Override
	public double calcularValor() {
		
		// Me guardo que dia es
		java.time.LocalDate hoy = LocalDate.now();
		
		// Veo cuantos dias hay entre la fecha y hoy
		long dias = ChronoUnit.DAYS.between(fecha, hoy);
		
		// retorno
		return this.montoDepositado +( this.montoDepositado * dias * this.interesDiario);
	}

}
