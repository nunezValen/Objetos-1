package io.github.unlp_oo.ejercicio12;

public class Cilindro extends Pieza {
	private int radio;
	private int altura;
	
	public Cilindro () {
		this.radio = 0;
		this.altura = 0;
	}
	
	
	
	public int getRadio() {
		return radio;
	}



	public void setRadio(int radio) {
		this.radio = radio;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	@Override
	public double getVolumen() {
		return Math.PI * Math.pow(this.radio, 2) * this.altura;
	}
	@Override
	public double getSuperficie() {
		return 2 * Math.PI * altura + 2 * Math.PI * Math.pow(radio, 2);
	}
	
	
}
