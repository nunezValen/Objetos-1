package io.github.unlp_oo.ejercicio24;

public abstract class Usuario {
	private String nombre;
	private double saldo;
	
	public Usuario(String n, double s) {
		this.nombre = n;
		this.saldo = s;
	}
	
	public void cargarSaldo(double monto) {
		this.saldo += monto;
	}
	
	public boolean puedoViajar() {
		if (this.saldo > 0) {
			return true;
		}
		return false;
	}
	
	public void quitarMonto(double monto) {
		this.saldo -= monto;
	}
	
}
