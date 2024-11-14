package io.github.unlp_oo.ejercicio12;

public class Esfera extends Pieza {
	private int radio;
	
	public Esfera() {
		this.radio = 0;
	}
	
	
	
	public int getRadio() {
		return radio;
	}



	public void setRadio(int radio) {
		this.radio = radio;
	}



	@Override
	public double getVolumen() {
		return ((4/3) * Math.PI * Math.pow(radio, 3));
	}

	@Override
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}
	
	
	
}
