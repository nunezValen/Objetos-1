package ar.edu.unlp.info.oo1.ejercicio9;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta () {
		this.saldo = 0;
	}
	public Cuenta (double monto) {
		this.saldo = monto;
	}
	public double getSaldo () {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	public boolean extraer (double monto) {
		if (this.puedeExtraerMonto(monto)) {
			this.extraerSinControlar(monto);;
			return true;
		}
		return false;
	}
	
	protected void extraerSinControlar(double monto) { //no entiendo de que sirve, es mejor llamar y crear un mentodo antes que hacer una resta?
		this.saldo -= monto;
	}
	
	protected abstract boolean puedeExtraerMonto(double monto);
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraerMonto(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
}
