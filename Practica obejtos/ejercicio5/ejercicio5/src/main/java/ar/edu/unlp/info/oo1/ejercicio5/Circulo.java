package ar.edu.unlp.info.oo1.ejercicio5;

public class Circulo extends Figura {
	private double radio;
	private double diametro;
	
	
	public Circulo (double radio, double d) {
		this.radio = radio;
		this.diametro = d;
	}
	
	public Circulo () {
		
	}
	
	public void setRadio(double r) {
		this.radio = r;
	}
	public double getRadio() {
		return this.radio;
	}
	public void setDiametro(double d) {
		this.diametro = d;
	}
	
	public double getDiametro() {
		if (this.diametro == 0) {
			this.diametro = this.radio * 2; 
		}
		
		return this.diametro;
	}
	
	@Override
	public double getArea() {
		return Math.PI * (radio*radio) ;
		
		//tambien Math.PI * (Math.pow(radio,2))
	}

	@Override
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}

}
