package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuadrado extends Figura{
	
	private double lado;
	
	public void setLado(double l) {
		this.lado=l;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	
	@Override
	public double getArea() {
		return Math.pow(getLado(), 2);
	}

	@Override
	public double getPerimetro() {
		return this.getLado() * 4;
	}

}
