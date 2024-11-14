package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro () {
		super();
	}
	
	public CajaDeAhorro (double monto) {
		super(monto);
	}
	
	@Override
	public void depositar(double monto) {
		super.depositar(monto - monto * 0.2 ); 
	}
	@Override
	public boolean extraer (double monto) {
		return super.extraer(monto * 1.2);
	}
	@Override
	protected boolean puedeExtraerMonto(double monto) {
		if (this.getSaldo() >= monto + 1.2) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean transferirACuenta (double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraerMonto(monto)) {
			this.extraer(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
}
