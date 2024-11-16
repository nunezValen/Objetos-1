package io.github.unlp_oo.ejercicio24;

public class Conductor extends Usuario {
	private Vehiculo vehiculo;
	public Conductor(String n, double s, Vehiculo v) {
		super(n, s);
		this.vehiculo = v;
	}

	@Override
	public void cargarSaldo(double monto) {
		
		super.cargarSaldo(this.vehiculo.getComision() * monto);
		
	}

	@Override
	public void quitarMonto(double monto) {
		super.quitarMonto(monto - this.vehiculo.getValor() * 0.1);
		
	}

}
