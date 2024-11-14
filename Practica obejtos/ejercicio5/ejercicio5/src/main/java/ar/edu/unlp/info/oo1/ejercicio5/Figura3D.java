package ar.edu.unlp.info.oo1.ejercicio5;

public class Figura3D {
	private double altura;
	private Figura caraBasal;
	
	public void setAltura(double valor) {
		this.altura = valor;
	}
	
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura cara) {
		this.caraBasal = cara;
	}
	
	public double getVolumen() {
		return altura * caraBasal.getArea();
	}
	
	public double getSuperficieExterior() {
		return 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura;
	}
}
