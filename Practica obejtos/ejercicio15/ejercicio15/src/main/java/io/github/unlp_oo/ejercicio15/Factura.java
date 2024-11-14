package io.github.unlp_oo.ejercicio15;
import java.time.LocalDate;
public class Factura {
	
	private Usuario user;
	private java.time.LocalDate fecha;
	private double bonificacion;
	private double monto;
	private double montoFinal;
	private CuadroTarifario cuadro;
	
	
	public Factura(Usuario u, Consumo c) {
		
		this.user = u;
		
		this.fecha = LocalDate.now();
		
		this.getMonto(c); 
		
		this.bonificacion = 1; //pongo en uno pq es descuento 
		
		if (this.getFactorPotencia(c) > 0.8) {
			this.bonificacion = this.monto * 0.9;
		}
		
		this.montoFinal = this.getMontoFinal();
		
	}
	
	public double getMontoFinal() {
		return this.monto * this.bonificacion; // al multiplicar por 0.9 le resto el 10%
	}
	
	public double getMonto(Consumo c) {
		return c.getConsumoEnergiaActiva() * cuadro.getPreciokwh();
	}
	
	private double getFactorPotencia(Consumo c) {
		return c.getConsumoEnergiaActiva() /
				( Math.sqrt(Math.pow(c.getConsumoEnergiaActiva(),2) 
						+ Math.pow(c.getConsumoEnergiaReactiva(),2 ))); 
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}

	public CuadroTarifario getCuadro() {
		return cuadro;
	}

	public void setCuadro(CuadroTarifario cuadro) {
		this.cuadro = cuadro;
	}

	public double getMonto() {
		return monto;
	}
	
	
	
}

