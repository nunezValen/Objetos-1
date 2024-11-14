package ar.edu.unlp.info.oo1.ejercicio8;

public class Gerente extends Empleado {
	
	public Gerente(String string) {
		super(string);
	}
	
	public double montoBasico() {
		return 57000;
	}
	
	public double aportes() {
		return this.montoBasico() * 0.05; 
	}
	
}
