package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta {
	
	private double limiteDescubierto;
	
	public CuentaCorriente() {
		super();
		this.limiteDescubierto = 0;
	}
	
	public CuentaCorriente(double saldo, double limiteDescubierto) {
		super(saldo);
		this.limiteDescubierto = limiteDescubierto;
	}
	
	public CuentaCorriente(double limiteDescubierto) {
		super();
		this.limiteDescubierto = limiteDescubierto;
	}
	
	public void setDescubierto(double d) {
		this.limiteDescubierto = d;
	}
	
	public double getDescubierto() {
		return this.limiteDescubierto;
	}
	
	@Override
	protected boolean puedeExtraerMonto(double monto) {
		if (this.getSaldo() >= monto || this.getSaldo() - monto >= this.limiteDescubierto ) {
			return true;
		}
		return false;
	}
	
	
	
}
