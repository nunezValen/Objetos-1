package ar.edu.unlp.info.oo1.ejercicio8;

public class Empleado {
	private String nombre;
	
	public Empleado (String s) {
		this.nombre = s;
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double aportes() {
		return 13500;
	}
	
	public double sueldoBasico() {
		return this.montoBasico() + this.aportes();
	}
	
}
